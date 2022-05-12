package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.utils.Genero;
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



}
