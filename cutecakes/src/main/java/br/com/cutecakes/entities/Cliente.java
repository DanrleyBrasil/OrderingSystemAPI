package br.com.cutecakes.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidade que representa um Cliente no sistema.
 */
@Entity
@Data
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String email;
    
    private String telefone;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos;

    // Getters e Setters são gerados automaticamente pela anotação @Data
}
