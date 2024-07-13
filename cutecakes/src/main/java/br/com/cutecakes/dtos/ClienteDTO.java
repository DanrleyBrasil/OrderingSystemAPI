package br.com.cutecakes.dtos;

import lombok.Data;

/**
 * Data Transfer Object (DTO) para a entidade Cliente.
 */
@Data
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    // Getters e Setters são gerados automaticamente pela anotação @Data
}
