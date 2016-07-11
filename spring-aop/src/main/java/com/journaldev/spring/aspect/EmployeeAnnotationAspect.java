package com.journaldev.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class EmployeeAnnotationAspect {

    @AfterReturning(
            pointcut = "@annotation(com.journaldev.spring.aspect.Loggable)",
            returning = "result")
    public void myAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("Exception thrown in Employee Method=" + joinPoint.toString());

        System.out.println("Executing myAdvice!!");

        System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));
    }
}
