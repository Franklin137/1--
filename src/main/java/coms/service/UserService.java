package coms.service;

import coms.beans.User;

public interface UserService {
    public User doLogin(String username, String passwd);
//    public boolean doRegister(User user);
}
