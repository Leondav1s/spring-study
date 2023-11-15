package com.davis.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.sql.SQLOutput;

//方式三：使用注解方式
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.davis.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* com.davis.service.UserServiceImpl.*(..))")
    public void After(){
        System.out.println("=====方法执行后=====");
    }
    @Around("execution(* com.davis.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp)throws Throwable{
        System.out.println("环绕前");
        Object proceed=jp.proceed();
        Signature signature=jp.getSignature();
        System.out.println("Signature"+signature);
        System.out.println("环绕后");

        //执行方法
        System.out.println(proceed);
        System.out.println(proceed);

    }
}
