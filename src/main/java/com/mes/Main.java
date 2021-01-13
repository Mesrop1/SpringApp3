package com.mes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args)  {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        //Java + anotation config

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);

        System.out.println(classicalMusic2 == classicalMusic1);

        context.close();
    }
}
