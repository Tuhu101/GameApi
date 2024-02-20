package com.example.gameapi.Controller;

import com.example.gameapi.model.Data;
import com.example.gameapi.model.Game;
import com.example.gameapi.service.GameService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.example.gameapi.model.Data.games;

@RestController
@RequestMapping("api/games")
public class GameController {
    @Autowired
    GameService gameService;
    /*@GetMapping
    public List<Game> getAllGames() {
        return games;
    }*/

    // Inject gameService. \\
    @GetMapping
    List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @PostMapping
    void createGame(@RequestBody Game game) {
        games.add(game);
    }

    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        Game gameFound = games.stream()
                .filter(game -> id == (game.getId()))
                .findFirst()
                .orElse(null);
        return gameFound;
    }


    @DeleteMapping("/{id}")
    Boolean deleteGameById(@PathVariable int id) {
        Game gameFound = games.stream()
                .filter(game -> id == (game.getId()))
                .findFirst()
                .orElse(null);
        if (gameFound != null) {
            games.remove(gameFound);
            return true;
        }
        return false;
    }

    @PutMapping()
    public Boolean updateGameById(@RequestBody Game updatedGame) {
       for(Game game : Data.games){
           Data.games.set(Data.games.indexOf(game), updatedGame);
           return true;
       }
       return false;
    }



}