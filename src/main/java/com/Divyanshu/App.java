package com.Divyanshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        AA obj=(AA)context.getBean("bean1");
        obj.show();
    }
}
