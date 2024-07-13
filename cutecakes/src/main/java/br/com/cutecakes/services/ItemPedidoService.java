package br.com.cutecakes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cutecakes.entities.ItemPedido;
import br.com.cutecakes.repositories.ItemPedidoRepository;

/**
 * Serviço para gerenciar operações relacionadas a ItemPedido.
 */
@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    /**
     * Retorna uma lista de todos os itens de pedido.
     *
     * @return lista de itens de pedido
     */
    public List<ItemPedido> listarTodos() {
        return itemPedidoRepository.findAll();
    }

    /**
     * Salva um novo item de pedido.
     *
     * @param itemPedido os dados do item de pedido a ser salvo
     * @return o item de pedido salvo
     */
    public ItemPedido salvar(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    /**
     * Busca um item de pedido pelo seu ID.
     *
     * @param id o ID do item de pedido a ser buscado
     * @return um Optional contendo o item de pedido se encontrado, ou vazio se não encontrado
     */
    public Optional<ItemPedido> buscarPorId(Long id) {
        return itemPedidoRepository.findById(id);
    }
}
