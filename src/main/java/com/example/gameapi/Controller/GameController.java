package com.example.gameapi.Controller;

import com.example.gameapi.model.Data;
import com.example.gameapi.model.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.example.gameapi.model.Data.games;

@RestController
@RequestMapping("api/games")
public class GameController {
    @GetMapping
    public List<Game> getAllGames() {
        return games;
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
       for(Game gg : Data.games){
           Data.games.set(Data.games.indexOf(gg), updatedGame);
           return true;
       }
       return false;
    }
}