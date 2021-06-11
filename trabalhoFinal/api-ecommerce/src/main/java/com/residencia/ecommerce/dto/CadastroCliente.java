package com.residencia.ecommerce.dto;

import com.residencia.ecommerce.entities.Cliente;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Getter
@Setter
public class CadastroCliente implements Serializable {

    //Cliente
    private String cpf;
    private Calendar dataNascimento;
    private String email;
    private String nome;
    private String senha;
    private String telefone;
    private String username;
    private Integer idEndereco;
    //Endereco
    private String cep;
    private String complemento;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String rua;



}
