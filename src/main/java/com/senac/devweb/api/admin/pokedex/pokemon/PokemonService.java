package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.pokemon.factory.AbstractFactoryPokemon;
import com.senac.devweb.api.admin.pokedex.pokemon.factory.IFactoryPokemon;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PokemonService {
    private PokemonRepository pokemonRepository;
    public Pokemon createPokemon(PokemonRepresentation.CreateOrUpdate create) {

        IFactoryPokemon factoryPokemon =
                AbstractFactoryPokemon.getFactory(create.getTipoPokemon());

        return this.pokemonRepository.save(factoryPokemon.buildPokemon(create));
    }
}
