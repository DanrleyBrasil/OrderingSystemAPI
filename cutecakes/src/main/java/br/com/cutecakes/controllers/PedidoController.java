package br.com.cutecakes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.cutecakes.entities.Pedido;
import br.com.cutecakes.services.PedidoService;

import java.util.List;

/**
 * Controlador REST para gerenciar pedidos.
 */
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    /**
     * Retorna uma lista de todos os pedidos.
     *
     * @return lista de pedidos
     */
    @GetMapping
    public List<Pedido> listarTodos() {
        return pedidoService.listarTodos();
    }

    /**
     * Salva um novo pedido.
     *
     * @param pedido dados do pedido a ser salvo
     * @return pedido salvo
     */
    @PostMapping
    public Pedido salvar(@RequestBody Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    /**
     * Busca um pedido pelo seu ID.
     *
     * @param id ID do pedido a ser buscado
     * @return ResponseEntity com o pedido encontrado ou 404 se não encontrado
     */
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
        return pedidoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
