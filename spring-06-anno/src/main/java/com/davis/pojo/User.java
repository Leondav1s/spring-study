package com.davis.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id=" class="/>
@Component
@Scope("singleton")
//@Scope("prototype")
public class User {
//    @Value("DAVIS")
    public String name;

//@Value("")也可以放在set方法上
    @Value("DAVIS")
    public void setName(String name) {
        this.name = name;
    }
}
