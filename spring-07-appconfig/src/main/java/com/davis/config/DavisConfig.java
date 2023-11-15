package com.davis.config;

import com.davis.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration  //这个也会被Spring接管，注册到容器，因为它本身也是@component
@ComponentScan("com.davis.pojo")
@Import(DavisConfig2.class)
public class DavisConfig {


    //注册一个bean,相当于之前写的bean标签
    //这个方法的名字，相当于bean标签中的id属性
    //方法的返回值，相当于bean中class属性
    @Bean
    public User getUser(){
        return new User(); //就是返回要注入到bean的对象
    }


}
