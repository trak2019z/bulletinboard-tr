package com.ttuleja.bulletinboard.Service;

import com.ttuleja.bulletinboard.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void addUser(String username, String password, String phone_number) {
        userDao.addUser(username,password,phone_number);
    }
}