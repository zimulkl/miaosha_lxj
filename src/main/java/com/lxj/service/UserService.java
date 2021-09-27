package com.lxj.service;

import com.lxj.dao.UserDao;
import com.lxj.domin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User getByid(int id){
        return userDao.getByid(id);
    }
}
