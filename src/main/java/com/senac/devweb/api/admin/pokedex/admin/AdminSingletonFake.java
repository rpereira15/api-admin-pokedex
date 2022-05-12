package com.senac.devweb.api.admin.pokedex.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AdminSingletonFake {

    private Long qtdeCadastrada = 0L;
    private Long qtdeConsultada = 0L;
}
