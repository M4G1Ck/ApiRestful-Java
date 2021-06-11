package com.residencia.ecommerce.exceptions;

import lombok.AllArgsConstructor;



public class PedidoProdutoNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    private Integer id;

    public PedidoProdutoNotFoundException(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }
}
