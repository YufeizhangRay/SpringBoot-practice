package cn.zyf.springboot.springboot13international.config;

import cn.zyf.springboot.springboot13international.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

@Configuration
public class MyConfig {

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
