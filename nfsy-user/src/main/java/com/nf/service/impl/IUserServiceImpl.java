package com.nf.service.impl;

import com.nf.dao.UserDao;
import com.nf.pojo.User;
import com.nf.service.UserService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class IUserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    JavaMailSender javaMailSender;
    @Value("${spring.mail.username}")
    public String from;
    @RabbitListener(queues = "nfsy-email")
    public String sendMail(String s) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(s);
        simpleMailMessage.setSubject("注册的验证码");
        int random =(int) ((Math.random()*9+1)*100000);
        String code = random+"";
        simpleMailMessage.setText(code);
        try {
            javaMailSender.send(simpleMailMessage);
            redisTemplate.opsForValue().set(s, code);
            redisTemplate.expire(s,180, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        User user=new User();
//        User uemail = userDao.getUemail(user);
//        if(uemail.getUEmail().equals(s)){
//            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//            simpleMailMessage.setFrom(from);
//            simpleMailMessage.setTo(s);
//            simpleMailMessage.setSubject("注册的验证码");
//            int random =(int) ((Math.random()*9+1)*100000);
//            String code = random+"";
//            simpleMailMessage.setText(code);
//            try {
//                javaMailSender.send(simpleMailMessage);
//                redisTemplate.opsForValue().set(s, code);
//                redisTemplate.expire(s,180, TimeUnit.SECONDS);
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }else{
//            Object o = redisTemplate.opsForValue().get(s);
//            if(o!=null){
//                if(o.toString().equals(user.getUCode())){
//                    BeanUtils.copyProperties(s,user);
//                    userDao.save(user);
//                }
//            }
//            return "注册成功";
//        }
            return "发送成功";
    }
}
