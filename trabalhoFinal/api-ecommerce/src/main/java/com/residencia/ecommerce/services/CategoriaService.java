package com.residencia.ecommerce.services;

import com.residencia.ecommerce.entities.Categoria;
import com.residencia.ecommerce.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria buscarPorId(Integer idCategoria){
        return categoriaRepository.getById(idCategoria);
    }

    public List<Categoria> buscarTodos(){
        return categoriaRepository.findAll();
    }

     //cria ctageoria
    public Categoria cadastrar(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    //atualizar categoria existente (no controller,categoria informada por @RequestBody
    public Boolean atualizar(Integer idCategoria, Categoria categoria){
        Categoria updatedCategoria = categoriaRepository.findById(idCategoria).get();
        updatedCategoria.setIdCategoria(idCategoria);
        updatedCategoria.setNomeCategoria(categoria.getNomeCategoria());
        updatedCategoria.setDescricao(categoria.getDescricao());
        updatedCategoria.setProdutos(categoria.getProdutos());
        categoriaRepository.save(updatedCategoria);
        if(updatedCategoria == categoria)
            return true;
        else
            return false;

    }

    //deletar categoria existente pelo id
    public boolean deletar(Integer idCategoria){
        if(idCategoria != null) {
            categoriaRepository.deleteById(idCategoria);
            return true;
        }
        else
            return false;

    }
}


