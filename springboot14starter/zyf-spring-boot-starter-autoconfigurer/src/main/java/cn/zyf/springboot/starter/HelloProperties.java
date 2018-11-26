package cn.zyf.springboot.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String prefix;//在全局配置文件中，hello.prefix=xxxxx

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
