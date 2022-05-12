package com.senac.devweb.api.admin.pokedex.pokemon;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @PostMapping()
    @RequestMapping("/")
    public ResponseEntity<Map<String, String>> createPokemon() {
        Map<String, String> response = new HashMap<>();
        response.put("mensagem", "Pokémon cadastrado com sucesso");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping()
    @RequestMapping("/{id}")
    public ResponseEntity<Map<String, String>> getOnePokemon() {
        Map<String, String> response = new HashMap<>();
        response.put("mensagem", "Você consultou um pokémon");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
