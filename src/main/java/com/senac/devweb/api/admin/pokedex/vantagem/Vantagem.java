package com.senac.devweb.api.admin.pokedex.vantagem;

import com.senac.devweb.api.admin.pokedex.pokemon.Pokemon;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "vantagem")
public class Vantagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="i_vantagem")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "i_pokemon", referencedColumnName="i_pokemon")
    private Pokemon pokemon;

    @Column(name = "pro")
    private Boolean pro;

    @Column(name = "imune")
    private Boolean imune;

    @Column(name = "tipo")
    private TipoPokemon tipoPokemon;
}
