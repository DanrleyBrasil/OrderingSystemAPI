package br.com.cutecakes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.cutecakes.entities.Cliente;

/**
 * Repositório JPA para a entidade Cliente.
 * 
 * Esta interface permite operações CRUD para a entidade Cliente, como salvar,
 * deletar, buscar por ID, entre outras, sem a necessidade de implementar
 * esses métodos manualmente.
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
