package cn.zyf.springboot.springboot9druid.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }

    //配置对整个web应用的监控
    @Bean
    public ServletRegistrationBean getViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet());
        String[] urlArr = new String[]{"/druid/*"};
        bean.setUrlMappings(Arrays.asList(urlArr));//设置对本servlet的url映射地址
        //还需要设置Druid后台的基本设置，如登录用户名和密码，哪些IP地址可以访问，哪些不可以
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","666666");
        initParams.put("allow","");//设置为空字符串表示任何IP地址都可以访问Druid监控后台
        bean.setInitParameters(initParams);
        return bean;
    }

    //配置过滤器，实现对所有的请求进行过滤，实现web应用对数据库的访问监控
    public FilterRegistrationBean getFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
        bean.setUrlPatterns(Arrays.asList(new String[]{"/*"}));
        //不能对所有资源进行拦截，静态，Druid后台都排除在外
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions","*.js,*.css,*.jpg,*.png,/druid/*");
        bean.setInitParameters(initParams);
        return bean;
    }
}
