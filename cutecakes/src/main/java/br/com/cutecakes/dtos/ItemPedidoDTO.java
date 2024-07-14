package br.com.cutecakes.dtos;

import java.math.BigDecimal;

import lombok.Data;

/**
 * Data Transfer Object (DTO) para a entidade ItemPedido.
 */
@Data
public class ItemPedidoDTO {
    private Long id;
    private int quantidade;
    private BigDecimal preco;
    private Long produtoId;
    private Long pedidoId;

    // Getters e Setters
}