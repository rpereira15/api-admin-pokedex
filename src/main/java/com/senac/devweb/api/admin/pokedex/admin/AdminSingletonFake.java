package com.senac.devweb.api.admin.pokedex.admin;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Service
public class AdminSingletonFake {

    private Long qtdeCadastrada = 0L;
    private Long qtdeConsultada = 0L;
}
