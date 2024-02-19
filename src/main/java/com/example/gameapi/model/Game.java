package com.example.gameapi.model;


import java.util.concurrent.atomic.AtomicInteger;
public class Game {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);
    int id;
    String name;
    Category category;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Game() {id = idGenerator.incrementAndGet();}
    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    enum Category {
        FPS, RTS, RPG, MMORpg, MOBA, BattleRoyal, Rouge, IdelGames, Turnbased, Stragegy, Sandbox, Survival, Simulation, Sport, Platform, Racing
    }


}
