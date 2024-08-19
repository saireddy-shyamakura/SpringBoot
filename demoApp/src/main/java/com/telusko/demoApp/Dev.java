package com.telusko.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer com;

    public void build(){
        System.out.println("in build function, in dev class");
        com.compile();
    }
}
