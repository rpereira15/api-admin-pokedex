package com.senac.devweb.api.admin.pokedex.pokemon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {
}
