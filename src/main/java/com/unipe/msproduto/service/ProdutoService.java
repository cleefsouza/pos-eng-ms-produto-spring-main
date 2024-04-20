package com.unipe.msproduto.service;

import com.unipe.msproduto.dto.ProdutoDTO;
import com.unipe.msproduto.entity.Produto;
import com.unipe.msproduto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ProdutoDTO getById(Long id) {
        return new ProdutoDTO(repository.findById(id).get());
    }

    public void updateQuantidade(Long id, int quantidade) {
        repository.updateQuantidadeById(quantidade, id);
    }

    public Produto save(ProdutoDTO dto) {
        return repository.save(Produto.fromDTO(dto));
    }
}
