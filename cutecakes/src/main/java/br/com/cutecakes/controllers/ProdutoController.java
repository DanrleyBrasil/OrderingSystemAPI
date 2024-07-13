package br.com.cutecakes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cutecakes.entities.Produto;
import br.com.cutecakes.services.ProdutoService;

/**
 * Controlador REST para gerenciar produtos.
 */
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    /**
     * Retorna uma lista de todos os produtos.
     *
     * @return lista de produtos
     */
    @GetMapping
    public List<Produto> listarTodos() {
        return produtoService.listarTodos();
    }

    /**
     * Salva um novo produto.
     *
     * @param produto dados do produto a ser salvo
     * @return produto salvo
     */
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    /**
     * Busca um produto pelo seu ID.
     *
     * @param id ID do produto a ser buscado
     * @return ResponseEntity com o produto encontrado ou 404 se não encontrado
     */
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
