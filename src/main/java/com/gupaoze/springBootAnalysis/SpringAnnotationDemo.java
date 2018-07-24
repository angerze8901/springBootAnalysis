package com.gupaoze.springBootAnalysis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zeshao on 2018/7/23.
 */
@Configuration
public class SpringAnnotationDemo
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.register(SpringAnnotationDemo.class);
        configApplicationContext.refresh();
        System.out.println(configApplicationContext.getBean(SpringAnnotationDemo.class));
    }

}
