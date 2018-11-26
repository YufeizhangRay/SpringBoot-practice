package cn.zyf.springboot.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication//只有在web应用中引入自定义的启动器的时候，这个自动配置类才会生效
@EnableConfigurationProperties(HelloProperties.class)//这个注解可以将此配置类和HelloProperties(又和全局文件有关联)建立关联
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloProperties helloProperties;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(helloProperties);//将HelloProperties与HelloService建立关联
        return  helloService;
    }

}
