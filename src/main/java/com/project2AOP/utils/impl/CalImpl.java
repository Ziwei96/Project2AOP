package com.project2AOP.utils.impl;

import com.project2AOP.utils.Cal;
import org.springframework.stereotype.Component;

@Component
public class CalImpl implements Cal {

    public int add(int num1, int num2) {
        //System.out.println("add的参数方法是["+num1+","+num2+"]");
        int result = num1 + num2;
        //System.out.println("add的方法的结果是"+result);
        return result;
    }

    public int sub(int num1, int num2) {
        //System.out.println("sub的参数方法是["+num1+","+num2+"]");
        int result = num1 - num2;
        //System.out.println("sub的方法的结果是"+result);
        return result;
    }

    public int mul(int num1, int num2) {
        //System.out.println("mul的参数方法是["+num1+","+num2+"]");
        int result = num1 * num2;
        //System.out.println("mul的方法的结果是"+result);
        return result;
    }

    public int div(int num1, int num2) {
        //System.out.println("div的参数方法是["+num1+","+num2+"]");
        int result = num1/num2;
        //System.out.println("div的方法的结果是"+result);
        return result;
    }
}
