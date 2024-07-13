package br.com.cutecakes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cutecakes.entities.ItemPedido;

/**
 * Repositório JPA para a entidade ItemPedido.
 * 
 * Esta interface permite operações CRUD para a entidade ItemPedido, como salvar,
 * deletar, buscar por ID, entre outras, sem a necessidade de implementar
 * esses métodos manualmente.
 */
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
