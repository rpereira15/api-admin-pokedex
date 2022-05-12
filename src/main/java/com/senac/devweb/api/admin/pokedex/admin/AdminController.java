package com.senac.devweb.api.admin.pokedex.admin;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("admin")
@AllArgsConstructor
public class AdminController {

    private AdminSingleton adminSingleton;
    private AdminSingletonFake adminSingletonFake;

    @GetMapping()
    @RequestMapping("/consultados")
    public ResponseEntity<Map<String, Object>> getQueryPokemon() {
        Map<String, Object> response = new HashMap<>();
        response.put("singleton", this.adminSingleton.getQtdeConsultada());
        response.put("fake", this.adminSingletonFake.getQtdeConsultada());

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping()
    @RequestMapping("/cadastrados")
    public ResponseEntity<Map<String, String>> getCreatedPokemon() {
        Map<String, String> response = new HashMap<>();
        response.put("mensagem", "Você cadastrou x pokémons");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
