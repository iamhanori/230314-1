package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.format.ResolverStyle;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("b1", TestBean.class);
        System.out.println("b1 : " + obj1);
        TestBean obj2 = ctx.getBean("b2", TestBean.class);
        System.out.println("b2 : " + obj2);

        System.out.println("Hello world!");
    }
}