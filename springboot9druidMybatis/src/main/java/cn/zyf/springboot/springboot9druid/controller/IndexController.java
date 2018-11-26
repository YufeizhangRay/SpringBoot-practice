package cn.zyf.springboot.springboot9druid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/index")
    public String index(Model model){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from test_user");
        model.addAttribute("users",maps);
        return "index";
    }
}
