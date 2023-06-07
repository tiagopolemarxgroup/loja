package com.api.loja.controller;

import com.api.loja.model.Categoria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class controllerCategoriaController {
    @GetMapping
    public ResponseEntity<Categoria> findAll(){
        Categoria categoria = new Categoria(1, "Informatica");
        return ResponseEntity.ok(categoria);
    }



}
