package com.project2AOP.test;

import com.project2AOP.utils.Cal;
import com.project2AOP.utils.MyInvocationHandler;
import com.project2AOP.utils.impl.CalImpl;

public class Test {
    public static void main(String[] args){
        Cal cal = new CalImpl();
//        cal.add(1,1);
//        cal.sub(2,1);
//        cal.mul(2,3);
//        cal.div(6,2);

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal proxy =(Cal) myInvocationHandler.bind(cal);
        proxy.add(1,1);
        proxy.sub(2,1);
        proxy.mul(2,3);
        proxy.div(6,2);
    }
}
