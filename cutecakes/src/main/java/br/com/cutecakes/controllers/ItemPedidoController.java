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

import br.com.cutecakes.entities.ItemPedido;
import br.com.cutecakes.services.ItemPedidoService;

/**
 * Controlador REST para gerenciar itens de pedido.
 */
@RestController
@RequestMapping("/itens-pedido")
public class ItemPedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    /**
     * Retorna uma lista de todos os itens de pedido.
     *
     * @return lista de itens de pedido
     */
    @GetMapping
    public List<ItemPedido> listarTodos() {
        return itemPedidoService.listarTodos();
    }

    /**
     * Salva um novo item de pedido.
     *
     * @param itemPedido dados do item de pedido a ser salvo
     * @return item de pedido salvo
     */
    @PostMapping
    public ItemPedido salvar(@RequestBody ItemPedido itemPedido) {
        return itemPedidoService.salvar(itemPedido);
    }

    /**
     * Busca um item de pedido pelo seu ID.
     *
     * @param id ID do item de pedido a ser buscado
     * @return ResponseEntity com o item de pedido encontrado ou 404 se não encontrado
     */
    @GetMapping("/{id}")
    public ResponseEntity<ItemPedido> buscarPorId(@PathVariable Long id) {
        return itemPedidoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
