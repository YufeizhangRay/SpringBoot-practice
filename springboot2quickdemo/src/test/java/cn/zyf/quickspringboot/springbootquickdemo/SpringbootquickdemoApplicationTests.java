package cn.zyf.quickspringboot.springbootquickdemo;

import cn.zyf.quickspringboot.springbootquickdemo.model.Address;
import cn.zyf.quickspringboot.springbootquickdemo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootquickdemoApplicationTests {

    @Autowired
    private User user;

    @Autowired
    private Address address;

    @Test
    public void contextLoads() {
        System.out.println("user: "+user);
        System.out.println("address: "+address);
    }

}
