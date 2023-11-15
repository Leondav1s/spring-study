package com.davis.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class People {
    //如果显示定义了Autowired Mrequired属性为false，说则这个对象可以为NULL，否则不允許为空
//    @Autowired
//    @Qualifier(value = "dog222")
    @Resource
    private Dog dog;
    @Autowired
    private Cat cat;

    private String name;

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    //使用AutoWired可以只要get

    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }

//    public Dog getDog() {
//        return dog;
//    }
//
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
//
//    public Cat getCat() {
//        return cat;
//    }
//
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
