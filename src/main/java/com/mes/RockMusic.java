package com.mes;

import org.springframework.stereotype.Component;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{

    private List<String> songs = new ArrayList<>();

    //list initialisation block

    {
        songs.add("Wind cries Mary");
        songs.add("Paint it black");
        songs.add("Can't seem to make you mine");
    }

    public String getSong() {
        return "Rock Music";
    }
}
