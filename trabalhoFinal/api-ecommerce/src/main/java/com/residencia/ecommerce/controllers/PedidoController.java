/*package com.residencia.ecommerce.controllers;

import java.util.List;

import javax.validation.Valid;

import com.residencia.ecommerce.entities.Pedido;
import com.residencia.ecommerce.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.residencia.ecommerce.erro.PedidoNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.residencia.


@Controller
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> retornaPedido(){
        return pedidoService.retornaPedido();
    }

    @GetMapping("/{id}")
    public Pedido retornaUmPedido(@PathVariable Integer id) throws PedidoNotFoundException {
        return pedidoService.retornaUmPedido(id);
    }
}*/
