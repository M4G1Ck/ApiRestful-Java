package com.residencia.ecommerce.services;

import java.util.List;
import java.util.Optional;

import com.residencia.ecommerce.entities.Pedido;
import com.residencia.ecommerce.exceptions.PedidoNotFoundException;
import com.residencia.ecommerce.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido findPedido(Integer id) throws PedidoNotFoundException{
        Optional<Pedido> achado = pedidoRepository.findById(id);
        if(achado.isPresent()){
            return achado.get();
        } else {
            throw new PedidoNotFoundException(id);
        }
    }

    public List<Pedido> retornaPedido(){
        return pedidoRepository.findAll();
    }

    public Pedido retornaUmPedido(Integer id) throws  PedidoNotFoundException{
        return findPedido(id);
    }

    //Create
    public Pedido adicionaPedido (Pedido pedido) {
        Pedido newPedido = pedidoRepository.save(pedido);
        if (newPedido.getIdPedido() != null) {
            return newPedido;
        }
        else {
            return null;
        }
    }

    //Update
    public Pedido atualizaPedido(Pedido pedido, Integer id) {
        pedido.setIdPedido(id);
        return pedidoRepository.save(pedido);
    }

    // Delete
    public boolean deletaPedido (Integer id) {
        if (id != null) {
            pedidoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
