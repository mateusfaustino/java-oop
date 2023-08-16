package com.mateusfaustino.main;

import com.mateusfaustino.models.Music;
import com.mateusfaustino.models.MyFavorites;
import com.mateusfaustino.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Forever");
        myMusic.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            myMusic.reproduzir();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Bolha Dev");

        for (int i = 0; i < 500; i++) {
            myPodcast.reproduzir();
        }

        for (int i = 0; i < 20; i++) {
            myMusic.curtir();
        }

        for (int i = 0; i < 10; i++) {
            myPodcast.curtir();
        }

        MyFavorites myFavorites = new MyFavorites();
        myFavorites.include(myMusic);
        myFavorites.include(myPodcast);
    }
}
