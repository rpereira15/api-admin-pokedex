package com.senac.devweb.api.admin.pokedex.habilidade;

import com.senac.devweb.api.admin.pokedex.pokemon.Pokemon;
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
@Table(name= "habilidade")
public class Habilidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="i_habilidade")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "i_pokemon", referencedColumnName="i_pokemon")
    private Pokemon pokemon;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;


}
