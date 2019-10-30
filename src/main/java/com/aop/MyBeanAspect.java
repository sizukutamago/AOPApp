package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBeanAspect {

    @Before("execution(* com.aop.IMyBean.addData(..))")
    public void addDataBefore(JoinPoint joinPoint) {
        System.out.println("*addData before...*");

        String args = "args: \"";
        for (Object ob : joinPoint.getArgs()) {
            args += ob + "\" ";
        }

        System.out.println(args);
    }
}
