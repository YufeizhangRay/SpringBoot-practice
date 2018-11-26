package cn.zyf.springboot.springboot15teststarter.controller;

import cn.zyf.springboot.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @GetMapping("/index")
    public String index(){
        return helloService.hello("zyf");
    }
}
