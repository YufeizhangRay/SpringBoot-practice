package cn.zyf.springboot.springboot10jap.controller;

import cn.zyf.springboot.springboot10jap.dao.UserDao;
import cn.zyf.springboot.springboot10jap.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserDao userDao;

    @ResponseBody
    @GetMapping("/save")
    public String save(){
        User user = new User();
        user.setUsername("Ray");
        user.setPassword("111");
        user.setRegDate(new Date());
        userDao.save(user);
        return "save success!";
    }

    @ResponseBody
    @GetMapping("/getUser")
    public User getUser(){
        User user = userDao.findById(1).get();
        return user;
    }

}
