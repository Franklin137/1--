package coms.controller;

import coms.beans.User;
import coms.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes(value={"user"})
public class UserController {
    UserServiceImpl userService;

    @Autowired
    UserController(UserServiceImpl userDao){this.userService=userDao;}

    @RequestMapping("/login")
    public String logining(String name, String pwd, Model model){
        User user= userService.doLogin(name, pwd);
        model.addAttribute("user",name);
        if(user!=null) return "success";
        String msg="账号或密码错误";
        model.addAttribute("msg",msg);
        return "/login";
    }

//    @RequestMapping("/register")
//    public String registering(String name,String pwd){
//        User user=null;
//        user.setName(name);
//        user.setPwd(pwd);
//        if(userService.doRegister(user)) return "login";
//        return "registerAgain";
//    }





}
