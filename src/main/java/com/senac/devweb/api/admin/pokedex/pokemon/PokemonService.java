package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PokemonService {
    private PokemonRepository pokemonRepository;
    public Pokemon createPokemon(PokemonRepresentation.CreateOrUpdate create) {

        return this.pokemonRepository.save(Pokemon.builder()
                .nome(create.getNome())
                .genero(create.getGenero())
                .forcaAtaque(create.getForcaAtaque())
                .forcaDefesa(create.getForcaDefesa())
                .vantagens(create.getVantagens())
                .desvantagens(create.getDesvantagens())
                .tipoPokemon(TipoPokemon.valueOf(create.getTipoPokemon().name()))
                .build());
    }
}
