package cn.zyf.springboot.springbootdemo4.controller;

import cn.zyf.springboot.springbootdemo4.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"aaa","aaa123"));
        users.add(new User(2,"bbb","bbb123"));
        users.add(new User(3,"ccc","ccc123"));
        model.addAttribute("users",users);
        model.addAttribute("date",new Date());
        return "users";
    }
}
