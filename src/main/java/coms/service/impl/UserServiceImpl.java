package coms.service.impl;

import coms.beans.User;
import coms.dao.UserDao;
import coms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    public User doLogin(String username, String passwd){
        System.out.println("di");
        User user= userDao.getUser(username,passwd);
        return user;
    }
    public boolean doRegister(User user){
        if(userDao.InsertUser(user)==1) return true;
        return false;
    }
}
