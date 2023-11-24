package com.mashibing.test;

import com.mashibing.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        Person bean = ac.getBean(Person.class);
        System.out.println(bean);


    }
}
