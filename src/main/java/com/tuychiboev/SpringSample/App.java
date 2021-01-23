package com.tuychiboev.SpringSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("my_spring.xml");
    	
//    	Vehicle vehicle = (Vehicle)ctx.getBean("car");
//        vehicle.drive();
//    	Tyre t = (Tyre)ctx.getBean("tyre");
//    	System.out.println(t);
    	Car car = (Car)ctx.getBean("car");
    	car.drive();
    }
}
