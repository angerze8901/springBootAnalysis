package com.gupaoze.springBootAnalysis;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

/**
 * Created by zeshao on 2018/7/24.
 */
public class SpringApplicationMulticaster
{
    public static void main(String[] args)
    {
        ApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
        multicaster.addApplicationListener(event -> System.out.println("接收到的事件: " + event));
        //lamda等同于
//        multicaster.addApplicationListener(new ApplicationListener<ApplicationEvent>()
//        {
//            @Override
//            public void onApplicationEvent(ApplicationEvent event)
//            {
//                System.out.println("接收到的事件: " + event);
//            }
//        });
        //发布事件
        multicaster.multicastEvent(new PayloadApplicationEvent<Object>("","Hello Hero"));
    }


}
