package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    private static ApplicationContext app;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        app = new AnnotationConfigApplicationContext(MyBeanConfig.class);
        IMyBean<String> bean1 = (IMyBean<String>) app.getBean("bean1");
        bean1.addData("Hello AOP World");
        System.out.println(bean1);

        IMyBean<Integer> bean2 = (IMyBean<Integer>) app.getBean("bean2");
        bean2.addData("this is sample data.");
        System.out.println(bean2);

    }
}
