package br.com.cutecakes.dtos;

import lombok.Data;

/**
 * Data Transfer Object (DTO) para a entidade Produto.
 */
@Data
public class ProdutoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private double preco;

    // Getters e Setters
}