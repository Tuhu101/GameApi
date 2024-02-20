package com.example.gameapi.service;

import com.example.gameapi.model.Game;
import com.example.gameapi.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Anotate @Service so program knows it's a service. \\
@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<Game> getAllGames(){
        List<Game> games = new ArrayList<>();
        gameRepository.findAll().forEach(game -> games.add(game));
        return games;
    }

}
