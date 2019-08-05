package com.bear.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.nio.charset.Charset;

@RestController
@SpringBootApplication //扫描这个package下所有配置文件，所以MySpringMVCConfig可以被引入
public class BearDemo1Application {

    @RequestMapping("/hello")
    public String index(){
        return "hello,world! 你好，世界！";
    }

    /*@Bean // 自定义消息转化器第一种方法
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("ISO-8859-1"));
        return converter;
    }*/

    public static void main(String[] args) {
        SpringApplication.run(BearDemo1Application.class, args);
        /*// 关闭文字banner，启动方式 start
        SpringApplication app = new SpringApplication(BearDemo1Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        // 关闭文字banner，启动方式 end*/
    }

}
