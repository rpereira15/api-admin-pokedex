package com.senac.devweb.api.admin.pokedex.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Genero {
    M("Masculino"),
    F("Feminino"),
    O("Outros");

    private String value;

}
