package com.example.gameapi.model;

import jakarta.persistence.*;

import java.util.concurrent.atomic.AtomicInteger;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table
public class Game {
    private static final AtomicInteger idGenerator = new AtomicInteger(0);

    @Id
    @GeneratedValue(strategy = IDENTITY)
    int id;
    @Column
    String name;
    @Column
    Category category;

   // public Game() {id = idGenerator.incrementAndGet();}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    enum Category {
        FPS, RTS, RPG, MMORpg, MOBA, BattleRoyal, Rouge, IdelGames, Turnbased, Stragegy, Sandbox, Survival, Simulation, Sport, Platform, Racing
    }


}
