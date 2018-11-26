package cn.zyf.springboot.springboot9druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.zyf.springboot.springboot9druid.dao")
@SpringBootApplication
public class Springboot9druidApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot9druidApplication.class, args);
    }
}
