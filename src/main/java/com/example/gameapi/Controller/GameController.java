package com.example.gameapi.Controller;

import com.example.gameapi.model.Data;
import com.example.gameapi.model.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/games")
public class GameController {
    @GetMapping
    public List<Game> getAllGames(){
        return Data.games;
    }

    @PostMapping
    void createGame(@RequestBody Game game){
        Data.games.add(game);
    }

    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id){
        Game gameFound = Data.games.stream()
                .filter(game -> id == (game.getId()))
                .findFirst()
                .orElse(null);
        return gameFound;
    }


    @DeleteMapping("/{id}")
    Boolean deleteGameById(@PathVariable int id){
        Game gameFound = Data.games.stream()
                .filter(game -> id == (game.getId()))
                .findFirst()
                .orElse(null);
        if(gameFound != null){
            Data.games.remove(gameFound);
            return true;
        }
        return false;
    }
}