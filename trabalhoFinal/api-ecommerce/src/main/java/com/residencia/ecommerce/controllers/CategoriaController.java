package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.entities.Categoria;
import com.residencia.ecommerce.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;


    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        Categoria novaCategoria = categoriaService.buscarPorId(id);
        if(novaCategoria != null)
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> buscarTodos(){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(categoriaService.buscarTodos(), headers, HttpStatus.OK);
    }

   @PostMapping
    public ResponseEntity<Categoria> salvar(@RequestBody Categoria categoria){
        HttpHeaders headers = new HttpHeaders();
        Categoria novaCategoria = categoriaService.cadastrar(categoria);
        if(novaCategoria != null)
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(novaCategoria, headers, HttpStatus.BAD_REQUEST);

    }

    @PutMapping("/{id")
    public ResponseEntity<Categoria> atualizar(@PathVariable Integer id, @RequestBody Categoria categoria){
        HttpHeaders headers = new HttpHeaders();
        if(categoriaService.atualizar(id, categoria))
            return new ResponseEntity<>(categoriaService.buscarPorId(id), headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(categoriaService.buscarPorId(id), headers, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping
    public ResponseEntity<Categoria> deletar(Integer id){
        Categoria categoriaDeletada = categoriaService.buscarPorId(id);
        HttpHeaders headers = new HttpHeaders();
        if(categoriaService.deletar(id))
            return new ResponseEntity<>(categoriaDeletada, headers, HttpStatus.OK);
        else
            return new ResponseEntity<>(categoriaDeletada, headers, HttpStatus.OK);
    }

}
