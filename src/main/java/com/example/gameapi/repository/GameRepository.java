package com.example.gameapi.repository;

import com.example.gameapi.model.Game;
import org.springframework.data.repository.CrudRepository;

// Only function is to inheret. \\
public interface GameRepository extends CrudRepository<Game, Integer> {
}
