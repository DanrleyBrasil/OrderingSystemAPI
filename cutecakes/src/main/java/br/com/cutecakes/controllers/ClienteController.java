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

import br.com.cutecakes.entities.Cliente;
import br.com.cutecakes.services.ClienteService;

/**
 * Controlador REST para gerenciar clientes.
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;

    /**
     * Retorna uma lista de todos os clientes.
     *
     * @return lista de clientes
     */
    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    /**
     * Salva um novo cliente.
     *
     * @param cliente dados do cliente a ser salvo
     * @return cliente salvo
     */
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    /**
     * Busca um cliente pelo seu ID.
     *
     * @param id ID do cliente a ser buscado
     * @return ResponseEntity com o cliente encontrado ou 404 se não encontrado
     */
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
