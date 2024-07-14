package br.com.cutecakes.entities;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidade que representa um Item de Pedido no sistema.
 */
@Entity
@Data
public class ItemPedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int quantidade;
    
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    // Getters e Setters são gerados automaticamente pela anotação @Data
}
