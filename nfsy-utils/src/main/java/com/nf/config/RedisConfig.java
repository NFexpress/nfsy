package com.nf.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;


/*
    首先标记这个是一个配置类，同时该配置在 RedisOperations 存在的情况下才会生效(即项目中引入了 Spring Data Redis)
    然后导入在 application.properties 中配置的属性
    然后再导入连接池信息（如果存在的话）
    最后，提供了两个 Bean ，RedisTemplate 和 StringRedisTemplate ，其中 StringRedisTemplate 是 RedisTemplate 的子类，
    两个的方法基本一致，不同之处主要体现在操作的数据类型不同，RedisTemplate 中的两个泛型都是 Object ，
    意味者存储的 key 和 value 都可以是一个对象，而 StringRedisTemplate 的 两个泛型都是 String ，
    意味者 StringRedisTemplate 的 key 和 value 都只能是字符串。如果开发者没有提供相关的 Bean ，
    这两个配置就会生效，否则不会生效。
* */
@Configuration
@ConditionalOnClass(RedisOperations.class)
@EnableConfigurationProperties(RedisProperties.class)
public class RedisConfig {

    @Bean
    @ConditionalOnMissingBean(name = "redisTemplate")
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object, Object> template = new RedisTemplate<>();

        /*
        * RedisTemplate 中，key 默认的序列化方案是 JdkSerializationRedisSerializer 。
        而在 StringRedisTemplate 中，key 默认的序列化方案是 StringRedisSerializer ，
        因此，如果使用 StringRedisTemplate ，默认情况下 key 前面不会有前缀。
        * */

        //  使用fastJson实现对于对象的序列化
        Jackson2JsonRedisSerializer serializer = new Jackson2JsonRedisSerializer(Object.class);

        //  设置"值"的序列号方式
        template.setValueSerializer(serializer);

        //  设置"hash"类型的数据的序列化方式
        template.setHashValueSerializer(serializer);

        //  设置"key"的序列化方式
        template.setKeySerializer(new StringRedisSerializer());

        //  设置"hash的key"的序列化方式
        template.setHashKeySerializer(new StringRedisSerializer());

        //  设置redis模版的工厂对象
        template.setConnectionFactory(redisConnectionFactory);

        return template;
    }

    @Bean
    @ConditionalOnMissingBean(StringRedisTemplate.class)
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        StringRedisTemplate template = new StringRedisTemplate();

        template.setConnectionFactory(redisConnectionFactory);

        return template;
    }
}
