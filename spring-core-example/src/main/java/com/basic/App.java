package com.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.basic.components.Car;
import com.basic.components.Wheel;
import com.basic.config.Appconfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Car car = new Car();
//        car.drive();
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        
        Wheel wheel = context.getBean(Wheel.class);
        wheel.use();
        System.out.println(wheel);
        
        Car car = context.getBean(Car.class);
        car.drive();
        
        
    }
}
