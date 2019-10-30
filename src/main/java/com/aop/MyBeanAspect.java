package com.aop;

import org.aspectj.lang.JoinPoint;

public class MyBeanAspect {

    public void addDataBefore(JoinPoint joinPoint) {
        System.out.println("*addData before...");

        String args = "args: \"";
        for (Object ob : joinPoint.getArgs()) {
            args += ob + "\" ";
        }

        System.out.println(args);
    }
}
