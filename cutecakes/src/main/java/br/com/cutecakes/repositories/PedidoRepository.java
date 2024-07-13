package br.com.cutecakes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cutecakes.entities.Pedido;

/**
 * Repositório JPA para a entidade Pedido.
 * 
 * Esta interface permite operações CRUD para a entidade Pedido, como salvar,
 * deletar, buscar por ID, entre outras, sem a necessidade de implementar
 * esses métodos manualmente.
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
