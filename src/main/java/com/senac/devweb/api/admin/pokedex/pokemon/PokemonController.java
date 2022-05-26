package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.admin.AdminSingleton;
import com.senac.devweb.api.admin.pokedex.admin.AdminSingletonFake;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class PokemonController {

    private AdminSingleton adminSingleton;

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

        AdminSingletonFake adminSingletonFake = new AdminSingletonFake();

        this.adminSingleton
                .setQtdeConsultada(this.adminSingleton.getQtdeConsultada() + 1L);

        adminSingletonFake
                .setQtdeConsultada(adminSingletonFake.getQtdeConsultada() + 1L);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
