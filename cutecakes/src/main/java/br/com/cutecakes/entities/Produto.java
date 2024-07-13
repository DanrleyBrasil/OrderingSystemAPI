package br.com.cutecakes.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

/**
 * Entidade que representa um Produto no sistema.
 */
@Entity
@Data
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private String descricao;
    
    private double preco;

    @OneToMany(mappedBy = "produto")
    private List<ItemPedido> itensPedido;

    // Getters e Setters são gerados automaticamente pela anotação @Data
}
