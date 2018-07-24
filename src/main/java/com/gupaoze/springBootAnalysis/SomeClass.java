package com.gupaoze.springBootAnalysis;

/**
 * Created by zeshao on 2018/7/23.
 */
@SomeAnnottation(description = "this is convert Description")
public class SomeClass
{
    @SomeAnnottation
    public void someMethos()
    {
        System.out.println("注解测试");
    }
}
