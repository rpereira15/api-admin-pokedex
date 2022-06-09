package com.senac.devweb.api.admin.pokedex.pokemon.factory;

import com.senac.devweb.api.admin.pokedex.pokemon.Pokemon;
import com.senac.devweb.api.admin.pokedex.pokemon.PokemonRepresentation;

public interface IFactoryPokemon {

    Pokemon buildPokemon(PokemonRepresentation.CreateOrUpdate create);
}
