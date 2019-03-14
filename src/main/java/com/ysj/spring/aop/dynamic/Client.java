package com.ysj.spring.aop.dynamic;

import com.ysj.spring.aop.pattern.RealSubject;
import com.ysj.spring.aop.pattern.Subject;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.request();
    }
}
