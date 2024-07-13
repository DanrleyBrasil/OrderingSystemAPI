package br.com.cutecakes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cutecakes.entities.Produto;
import br.com.cutecakes.repositories.ProdutoRepository;

/**
 * Serviço para gerenciar operações relacionadas a Produto.
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Retorna uma lista de todos os produtos.
     *
     * @return lista de produtos
     */
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    /**
     * Salva um novo produto.
     *
     * @param produto os dados do produto a ser salvo
     * @return o produto salvo
     */
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    /**
     * Busca um produto pelo seu ID.
     *
     * @param id o ID do produto a ser buscado
     * @return um Optional contendo o produto se encontrado, ou vazio se não encontrado
     */
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
}
