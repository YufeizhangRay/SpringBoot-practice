package cn.zyf.quickspringboot.springbootquickdemo.config;

import cn.zyf.quickspringboot.springbootquickdemo.model.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {
    //方法名即为配置文件中bean标签里的id对应的值
    @Bean
    public Address address(){
        return new Address();
    }
}
