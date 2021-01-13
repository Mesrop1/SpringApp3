package com.mes;

//using for config xml,and more

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    //we can create Beans using Bean anotation

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RepMusic repMusic(){
        return new RepMusic();
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), repMusic());
    }

    //IoC
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }


}
