package com.nf.dao;

import com.nf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao{
    int save(User user);
    User getUemail(User user);
}
