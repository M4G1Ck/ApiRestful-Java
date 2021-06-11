package com.residencia.ecommerce.controllers;

import java.util.List;

import javax.validation.Valid;

import com.residencia.ecommerce.entities.Cliente;
import com.residencia.ecommerce.entities.Produto;
import com.residencia.ecommerce.exceptions.ProdutoNotFoundException;
import com.residencia.ecommerce.services.ProdutoService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/produto")
@Controller
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> retornaProduto(){
        return produtoService.retornaProduto();
    }

    @GetMapping("/{id}")
    public Produto retornaUmProduto(@PathVariable Integer id) throws ProdutoNotFoundException{
        return produtoService.retornaUmProduto(id);
    }

    //Cadastrar produto
    @PostMapping("/cadastrar")
    public ResponseEntity<Produto> adicionaProduto(@Valid @RequestBody Produto produto) throws ProdutoNotFoundException {
        HttpHeaders headers = new HttpHeaders();
        Produto novoProduto = produtoService.cadastro(produto);

        if (null != novoProduto){
            return new ResponseEntity<>(novoProduto, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public Produto atualizaProduto(@PathVariable Integer id, @Valid @RequestBody Produto produto) throws ProdutoNotFoundException {
        return produtoService.atualizaProduto(produto, id);
    }

    @DeleteMapping("/{id}")
    public void produtoCategoria(@PathVariable Integer id) throws ProdutoNotFoundException {
        produtoService.deletaProduto(id);
    }
}
