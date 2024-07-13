package br.com.cutecakes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cutecakes.entities.Pedido;
import br.com.cutecakes.repositories.PedidoRepository;

import java.util.List;
import java.util.Optional;

/**
 * Serviço para gerenciar operações relacionadas a Pedido.
 */
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    /**
     * Retorna uma lista de todos os pedidos.
     *
     * @return lista de pedidos
     */
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    /**
     * Salva um novo pedido.
     *
     * @param pedido os dados do pedido a ser salvo
     * @return o pedido salvo
     */
    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    /**
     * Busca um pedido pelo seu ID.
     *
     * @param id o ID do pedido a ser buscado
     * @return um Optional contendo o pedido se encontrado, ou vazio se não encontrado
     */
    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }
}
