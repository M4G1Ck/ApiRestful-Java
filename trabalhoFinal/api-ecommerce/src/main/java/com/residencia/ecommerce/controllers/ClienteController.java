package com.residencia.ecommerce.controllers;

import com.residencia.ecommerce.dto.CadastroCliente;
import com.residencia.ecommerce.entities.Cliente;
import com.residencia.ecommerce.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //Cadastro
    @PostMapping("/cadastrar")
    public ResponseEntity<Cliente> cadastrar(@RequestBody CadastroCliente cadastroCliente){
        HttpHeaders headers = new HttpHeaders();
        Cliente novoCliente = clienteService.cadastro(cadastroCliente);

        if (null != novoCliente){
            return new ResponseEntity<>(novoCliente, headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, headers, HttpStatus.BAD_REQUEST);
        }
    }

    //Update
    @PutMapping("/atualizar/{id}")
    public Cliente update(@RequestBody CadastroCliente cadastro, @PathVariable Integer id){
        return clienteService.update(cadastro, id);
    }

    //Deletar conta
    @DeleteMapping("/deletar/{id}")
    public  ResponseEntity<Cliente> delete (@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        boolean deletada = clienteService.delete(id);
        if (deletada) {
            return new ResponseEntity<>( headers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(headers, HttpStatus.BAD_REQUEST);
        }
    }
}
