package com.residencia.ecommerce.repositories;

import com.residencia.ecommerce.entities.ProdutosPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutosPedidoRepository extends JpaRepository<ProdutosPedido, Integer> {
}
