package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.utils.Genero;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public interface PokemonRepresentation {

    @Data
    @Builder
    @AllArgsConstructor
    class CreateOrUpdate {

        @NotNull(message="O nome não pode ser nulo")
        @NotEmpty(message="O nome não pode ser vazio")
        private String nome;

        private TipoPokemon tipoPokemon;

        @NotNull(message="A força de ataque não pode ser nulo")
        private Long forcaAtaque;

        private Long forcaDefesa;

        private Genero genero;

        private String desvantagens;

        private String vantagens;
    }

}
