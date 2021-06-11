package com.residencia.ecommerce.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.residencia.ecommerce.entities.Categoria;
import com.residencia.ecommerce.entities.Produto;
import com.residencia.ecommerce.repositories.CategoriaRepository;
import com.residencia.ecommerce.repositories.ProdutoRepository;
import com.residencia.ecommerce.exceptions.ProdutoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Produto findProduto(Integer id) throws ProdutoNotFoundException{
            Optional<Produto> achado = produtoRepository.findById(id); //se o produto for "achado" ele retorna o produto pelo id
            if(achado.isPresent()){
                return achado.get();
            }else{
                throw new ProdutoNotFoundException(id); //se nao "achado" ele retorna erro com o id nao encontrado
            }
    }

    public List<Produto> retornaProduto(){
        return produtoRepository.findAll();
    }

    public Produto retornaUmProduto(Integer id) throws ProdutoNotFoundException{
        return findProduto(id);
    }

    //Cadastrar produto
    public Produto cadastro (Produto produto) {
       return produtoRepository.save(produto);
    }

    //Update
    public Produto atualizaProduto(Produto produto, Integer id) {
        produto.setIdProduto(id);
        return produtoRepository.save(produto);
    }

    // Delete
    public boolean deletaProduto (Integer id) {
        if (id != null) {
            produtoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    //Create com imagem
    public Produto adicionaImagemProduto (Produto produto) {
        Produto newProduto = produtoRepository.save(produto);
        if (newProduto.getIdProduto() != null) {
            return newProduto;
        }
        else {
            return null;
        }
    }
}
