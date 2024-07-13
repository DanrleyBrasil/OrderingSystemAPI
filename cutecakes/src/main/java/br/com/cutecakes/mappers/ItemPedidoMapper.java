package br.com.cutecakes.mappers;

import br.com.cutecakes.dtos.ItemPedidoDTO;
import br.com.cutecakes.entities.ItemPedido;

/**
 * Classe utilitária para mapear entre a entidade ItemPedido e o DTO ItemPedidoDTO.
 */
public class ItemPedidoMapper {

    /**
     * Converte um ItemPedido em um ItemPedidoDTO.
     *
     * @param itemPedido o item de pedido a ser convertido
     * @return o ItemPedidoDTO resultante
     */
    public static ItemPedidoDTO toDTO(ItemPedido itemPedido) {
        ItemPedidoDTO dto = new ItemPedidoDTO();
        dto.setId(itemPedido.getId());
        dto.setQuantidade(itemPedido.getQuantidade());
        dto.setPreco(itemPedido.getPreco());
        dto.setProdutoId(itemPedido.getProduto().getId());
        dto.setPedidoId(itemPedido.getPedido().getId());
        return dto;
    }

    /**
     * Converte um ItemPedidoDTO em um ItemPedido.
     *
     * @param dto o ItemPedidoDTO a ser convertido
     * @return o ItemPedido resultante
     */
    public static ItemPedido toEntity(ItemPedidoDTO dto) {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setId(dto.getId());
        itemPedido.setQuantidade(dto.getQuantidade());
        itemPedido.setPreco(dto.getPreco());
        // Lógica para mapear produto e pedido
        // itemPedido.setProduto(produtoRepository.findById(dto.getProdutoId()).orElse(null));
        // itemPedido.setPedido(pedidoRepository.findById(dto.getPedidoId()).orElse(null));
        return itemPedido;
    }
}
