package com.ysj.spring.aop.pattern;

public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("execute before");
        try {
            realSubject.request();
        }catch (Exception e){
            System.out.println("ex:"+e);
            throw e;
        }finally {
            System.out.println("after");
        }
    }
}
