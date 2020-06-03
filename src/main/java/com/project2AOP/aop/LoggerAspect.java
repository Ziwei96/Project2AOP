package com.project2AOP.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect//切面对象
@Component//ioc管理
public class LoggerAspect {

    //切割calImpl里面所有方法所有参数
    @Before("execution(public int com.project2AOP.utils.impl.CalImpl.*(..))")
    public void before(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"方法的参数是"+ args);
    }

    @After("execution(public int com.project2AOP.utils.impl.CalImpl.*(..)) ")
    public void after(JoinPoint joinPoint){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行完毕");
    }

    @AfterReturning(value = "execution(public int com.project2AOP.utils.impl.CalImpl.*(..)) ",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的结果是"+ result);
    }

    @AfterThrowing(value = "execution(public int com.project2AOP.utils.impl.CalImpl.*(..))",throwing = "exception")
    public void AfterThrowing(JoinPoint joinPoint,Exception exception){
        //获取方法名
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的异常是"+ exception);
    }
}
