package br.com.cutecakes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cutecakes.entities.Produto;

/**
 * Repositório JPA para a entidade Produto.
 * 
 * Esta interface permite operações CRUD para a entidade Produto, como salvar,
 * deletar, buscar por ID, entre outras, sem a necessidade de implementar
 * esses métodos manualmente.
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
