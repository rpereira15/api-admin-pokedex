package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.admin.AdminSingleton;
import com.senac.devweb.api.admin.pokedex.admin.AdminSingletonFake;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pokemon")
@AllArgsConstructor
public class PokemonController {

    private AdminSingleton adminSingleton;
    private PokemonService pokemonService;

    @PostMapping()
    @RequestMapping("/")
    public ResponseEntity<Pokemon> createPokemon(
            @Valid @RequestBody PokemonRepresentation.CreateOrUpdate create) {

        Pokemon novoPokemon = this.pokemonService.createPokemon(create);
        this.adminSingleton.setQtdeCadastrada(this.adminSingleton.getQtdeCadastrada() + 1);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoPokemon);
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
