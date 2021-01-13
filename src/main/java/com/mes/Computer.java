package com.mes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Computer {
    //assuming MusicPlayer part of Computer,making dependencies between 2 beans,relations

    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer id " + id + "MusicPlayer " + musicPlayer.playMusic();
    }
}
