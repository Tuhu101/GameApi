package com.example.gameapi.model;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Game> games = new ArrayList<>();

    public Data() {
        Game g1 = new Game();
        g1.setName("Minecraft");
        g1.setCategory(Game.Category.Sandbox);
        //g1.id = 1;
        games.add(g1);

        Game g2 = new Game();
        g2.setName("CS2");
        g2.setCategory(Game.Category.FPS);
        //g1.id = 1;
        games.add(g2);
    }
}