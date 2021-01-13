package com.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    //lesson 11 and 12
      private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
    }
}
