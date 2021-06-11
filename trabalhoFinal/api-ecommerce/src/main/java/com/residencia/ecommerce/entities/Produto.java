package com.residencia.ecommerce.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer idProduto;

    @Column(name = "nome_produto")
    private String nomeProduto;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "quant_em_estoque")
    private Integer quantEmEstoque;

    @CreationTimestamp
    @Column(name = "data_cadastro_produto")
    private Timestamp dataCadastroProduto;

    @Column(name = "imagem")
    private Byte imagem;

    @ManyToOne //Relacionamento com Categoria
    @JoinColumn(name = "id_categoria")
    private Categoria idCategoria;

    @OneToOne(mappedBy = "produto") //Relacionamento com ProdutosPedido
    private ProdutosPedido pedido;

}
