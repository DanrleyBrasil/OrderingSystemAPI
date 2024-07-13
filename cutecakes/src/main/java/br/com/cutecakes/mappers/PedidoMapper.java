package br.com.cutecakes.mappers;

import java.util.stream.Collectors;

import br.com.cutecakes.dtos.PedidoDTO;
import br.com.cutecakes.entities.Pedido;

/**
 * Classe utilitária para mapear entre a entidade Pedido e o DTO PedidoDTO.
 */
public class PedidoMapper {

    /**
     * Converte um Pedido em um PedidoDTO.
     *
     * @param pedido o pedido a ser convertido
     * @return o PedidoDTO resultante
     */
    public static PedidoDTO toDTO(Pedido pedido) {
        PedidoDTO dto = new PedidoDTO();
        dto.setId(pedido.getId());
        dto.setDataEntrega(pedido.getDataEntrega());
        dto.setClienteId(pedido.getCliente().getId());
        dto.setItens(pedido.getItens().stream()
                .map(ItemPedidoMapper::toDTO)
                .collect(Collectors.toList()));
        return dto;
    }

    /**
     * Converte um PedidoDTO em um Pedido.
     *
     * @param dto o PedidoDTO a ser convertido
     * @return o Pedido resultante
     */
    public static Pedido toEntity(PedidoDTO dto) {
        Pedido pedido = new Pedido();
        pedido.setId(dto.getId());
        pedido.setDataEntrega(dto.getDataEntrega());
        // Lógica para mapear cliente e itens
        // pedido.setCliente(clienteRepository.findById(dto.getClienteId()).orElse(null));
        // pedido.setItens(dto.getItens().stream()
        //         .map(ItemPedidoMapper::toEntity)
        //         .collect(Collectors.toList()));
        return pedido;
    }
}
