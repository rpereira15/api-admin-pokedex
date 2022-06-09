package com.senac.devweb.api.admin.pokedex.pokemon.factory;

import com.senac.devweb.api.admin.pokedex.pokemon.Pokemon;
import com.senac.devweb.api.admin.pokedex.pokemon.PokemonRepresentation;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;

public class PokemonPlantaFactory implements IFactoryPokemon{

    @Override
    public Pokemon buildPokemon(PokemonRepresentation.CreateOrUpdate create) {
        return Pokemon.builder()
                .nome(create.getNome())
                .genero(create.getGenero())
                .forcaAtaque(create.getForcaAtaque())
                .forcaDefesa(create.getForcaDefesa())
                .vantagens(create.getVantagens())
                .desvantagens(create.getDesvantagens())
                .tipoPokemon(TipoPokemon.valueOf(create.getTipoPokemon().name()))
                .build();
    }


}
