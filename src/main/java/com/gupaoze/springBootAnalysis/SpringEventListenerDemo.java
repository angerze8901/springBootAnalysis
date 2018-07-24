package com.gupaoze.springBootAnalysis;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by zeshao on 2018/7/24.
 */
public class SpringEventListenerDemo
{
    public static void main(String[] args)
    {
        GenericApplicationContext context = new GenericApplicationContext();

        //监听
        context.addApplicationListener(new ApplicationListener<ApplicationEvent>()
        {
            @Override
            public void onApplicationEvent(ApplicationEvent event)
            {
                System.out.println("监听事件" + event);
            }
        });
        //启动Spring应用上下文
        context.refresh();
        //Spirng发布事件
        context.publishEvent("Hero");
    }


}
