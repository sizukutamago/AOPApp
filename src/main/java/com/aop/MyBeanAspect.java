package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

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

    @AfterReturning(value="execution(* com.aop.IMyBean.toString())", returning = "str")
    public void toStringAfterReturning(String str) {
        System.out.println("*toString returning...");
        System.out.println("return: " + str);
        System.out.println("*...end toString returning");
    }

    @AfterThrowing(value = "execution(* com.aop.MyBean2.addData(..))", throwing = "e")
    public void addDataAfterThrowing(Exception e) {
        System.out.println("*Except in addData");
        System.out.println(e.getLocalizedMessage());
        System.out.println("*...end Except in addData");
    }

    @Around("execution(* com.aop.MyBean1.addData(..))")
    public void toStringAround(ProceedingJoinPoint joinPoint) {
        System.out.println("*around addData...*");
        System.out.println("before:" + joinPoint.getTarget());
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("after:" + joinPoint.getTarget());
        System.out.println("*...end around addData*");
    }
}
