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

    @GetMapping
    List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @PostMapping
    void createGame(@RequestBody Game game) {
        gameService.createGame(game);
    }


    /*@GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        Game gameFound = games.stream()
                .filter(game -> id == (game.getId()))
                .findFirst()
                .orElse(null);
        return gameFound;
    }*/
    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }


    /*@DeleteMapping("/{id}")
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
    }*/
    @DeleteMapping("/{id}")
    void deleteGameById(@PathVariable int id) {
        gameService.delete(id);
    }

    /*@PutMapping()
    public Boolean updateGameById(@RequestBody Game updatedGame) {
       for(Game game : Data.games){
           Data.games.set(Data.games.indexOf(game), updatedGame);
           return true;
       }
       return false;
    }*/

    // Big Questions. \\
    /*@PutMapping()
    public void updateGameById(@RequestBody Game updatedGame) {
       gameService.set(updatedGame);
    }*/



}