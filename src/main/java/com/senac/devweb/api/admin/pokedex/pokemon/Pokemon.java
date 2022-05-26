package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.utils.Genero;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="i_pokemon")
    private Integer id;
    @Column(name="nome")
    private String nome;

    @Column(name = "tipo_pokemon")
    private TipoPokemon tipoPokemon;

    @Column(name = "forca_ataque")
    private Long forcaAtaque;

    @Column(name = "forca_defesa")
    private Long forcaDefesa;

    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Column(name = "desvantagens")
    private String desvantagens;

    @Column(name = "vantagens")
    private String vantagens;

    public Pokemon(PokemonBuilder pokemonBuilder) {
        this.id = pokemonBuilder.id;
        this.nome = pokemonBuilder.nome;
    }


    public static class PokemonBuilder {
        private Integer id;
        private String nome;
        private TipoPokemon tipoPokemon;
        private Long forcaAtaque;
        private Long forcaDefesa;
        private Genero genero;
        private String desvantagens;
        private String vantagens;
        public PokemonBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PokemonBuilder tipoPokemon(TipoPokemon tipoPokemon) {
            this.tipoPokemon = tipoPokemon;
            return this;
        }

        public PokemonBuilder forcaAtaque(Long forcaAtaque) {
            this.forcaAtaque = forcaAtaque;
            return this;
        }

        public Pokemon build() {
            Pokemon pokemon = new Pokemon(this);
            validate(this);
            return pokemon;
        }

        private void validate(PokemonBuilder validate) {

        }












    }

























}
