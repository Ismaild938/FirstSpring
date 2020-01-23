package com.myspring.driver;

import com.myspring.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCar {
    public static void main(String[] args) {

        ApplicationContext c = new ClassPathXmlApplicationContext("application-context.xml");
        Car car = (Car) c.getBean("car");
        System.out.println(car);
    }
}
