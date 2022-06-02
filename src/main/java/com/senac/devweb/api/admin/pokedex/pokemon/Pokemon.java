package com.senac.devweb.api.admin.pokedex.pokemon;

import com.senac.devweb.api.admin.pokedex.utils.Genero;
import com.senac.devweb.api.admin.pokedex.utils.TipoPokemon;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name= "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="i_pokemon")
    private Integer id;
    @Column(name="nome")
    @NotNull(message="O nome não pode ser nulo")
    @NotEmpty(message="O nome não pode ser vazio")
    private String nome;

    @Column(name = "tipo_pokemon")
    @Enumerated(EnumType.STRING)
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
