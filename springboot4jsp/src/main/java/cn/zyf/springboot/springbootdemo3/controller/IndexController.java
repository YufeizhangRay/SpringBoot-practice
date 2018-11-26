package cn.zyf.springboot.springbootdemo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("aaa","jsp视图引擎");
        return "index";
    }
}
