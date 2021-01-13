package com.mes;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {

//    private ClassicalMusic() {}
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


    @Override
    public String  getSong() {
        return "ClassicalMusic";
    }
}
