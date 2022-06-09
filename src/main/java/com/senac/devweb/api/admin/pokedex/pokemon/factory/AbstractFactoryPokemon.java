package com.senac.devweb.api.admin.pokedex.pokemon.factory;

import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;

public abstract class AbstractFactoryPokemon {

    public static IFactoryPokemon getFactory(TipoPokemon tipo) {
        if(tipo.equals(TipoPokemon.PLANTA)) {
            return new PokemonPlantaFactory();
        }

        return null;
    }

}
