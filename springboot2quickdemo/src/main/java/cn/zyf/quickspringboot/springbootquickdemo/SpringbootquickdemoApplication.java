package cn.zyf.quickspringboot.springbootquickdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource({"classpath:spring.xml"})
@SpringBootApplication
public class SpringbootquickdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootquickdemoApplication.class, args);
    }
}
