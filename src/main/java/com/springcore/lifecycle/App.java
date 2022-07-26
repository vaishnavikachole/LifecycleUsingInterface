package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
         Employee employees = (Employee)context.getBean("employee");
         context.registerShutdownHook();
         System.out.println(employees);
         
      //   context.registerShutdownHook();
         // registering shutdown hook 
    }
}
