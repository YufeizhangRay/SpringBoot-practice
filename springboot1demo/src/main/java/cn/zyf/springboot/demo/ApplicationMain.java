package cn.zyf.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这个注解标志这个类就是我们的主启动类
 * 扫描这个主类的所在的包及其主包
 */
@SpringBootApplication
public class ApplicationMain {
    //程序的主入口
    public static void main(String[] args) {

        //调用一个静态方法run，这个方法才是springboot的真正执行入口
        SpringApplication.run(ApplicationMain.class, args);
    }
}
