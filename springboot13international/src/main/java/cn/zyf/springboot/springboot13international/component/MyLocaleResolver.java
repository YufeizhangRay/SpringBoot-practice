package cn.zyf.springboot.springboot13international.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String language = httpServletRequest.getParameter("language");
        Locale locale = Locale.getDefault();//默认为操作系统区域信息
        if(!StringUtils.isEmpty(language)){//language不是空
            if(language.equals("zh")){
                locale = new Locale("zh","CN");
            }
            if(language.equals("en")){
                locale = new Locale("en","US");
            }
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
