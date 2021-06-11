package com.residencia.ecommerce.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Integer idPedido;

    @Column(name = "numero_pedido", unique = true)
    private Integer numeroPedido;

    @Column(name = "valor_total_pedido")
    private Integer valorTotalPedido;

    @CreationTimestamp
    @Column(name = "data_pedido")
    private Timestamp dataPedido;

    @Column(name = "status")
    private boolean status;

    @ManyToOne //Relacionamento com Cliente
    @JoinColumn(name = "id_cliente")
    private Cliente idCliente;

    @OneToOne(mappedBy = "pedido") //Relacionamento com ProdutosPedido
    private ProdutosPedido produto;

}
