package br.com.cutecakes.dtos;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

/**
 * Data Transfer Object (DTO) para a entidade Pedido.
 */
@Data
public class PedidoDTO {
    private Long id;
    private LocalDateTime dataEntrega;
    private Long clienteId;
    private List<ItemPedidoDTO> itens;

    // Getters e Setters
}
