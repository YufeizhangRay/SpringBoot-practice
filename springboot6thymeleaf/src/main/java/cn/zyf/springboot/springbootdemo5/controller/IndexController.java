package cn.zyf.springboot.springbootdemo5.controller;

import cn.zyf.springboot.springbootdemo5.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class IndexController {

    @GetMapping("index")
    public String index(Model model){
        User user = new User(1,"aaa","123");
        model.addAttribute("user",user);
        model.addAttribute("str","<h1>Ray</h1>");
        model.addAttribute("dd",new Date());
        model.addAttribute("sex","女");
        model.addAttribute("id","1");
        List<User> users = new ArrayList<>();
        users.add(new User(2,"bbb","bbb"));
        users.add(new User(3,"ccc","ccc"));
        users.add(new User(4,"ddd","ddd"));
        model.addAttribute("users",users);
        Map<String,User> maps = new HashMap();
        maps.put("aaa",new User(5,"eee","eee"));
        maps.put("bbb",new User(6,"fff","fff"));
        model.addAttribute("maps",maps);
        return "index";
    }
}
