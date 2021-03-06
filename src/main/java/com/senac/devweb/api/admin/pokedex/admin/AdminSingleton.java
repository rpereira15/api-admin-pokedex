package com.senac.devweb.api.admin.pokedex.admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("singleton")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminSingleton {

    private Long qtdeCadastrada = 0L;
    private Long qtdeConsultada = 0L;

}
