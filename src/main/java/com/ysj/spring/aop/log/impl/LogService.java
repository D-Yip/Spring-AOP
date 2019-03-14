package com.ysj.spring.aop.log.impl;

import com.ysj.spring.aop.log.Loggable;
import org.springframework.stereotype.Component;

@Component
public class LogService implements Loggable {
    @Override
    public void log() {
        System.out.println("log from LogService");
    }
}
