package br.com.cutecakes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cutecakes.entities.Cliente;
import br.com.cutecakes.repositories.ClienteRepository;

/**
 * Serviço para gerenciar operações relacionadas a Cliente.
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    /**
     * Retorna uma lista de todos os clientes.
     *
     * @return lista de clientes
     */
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    /**
     * Salva um novo cliente.
     *
     * @param cliente os dados do cliente a ser salvo
     * @return o cliente salvo
     */
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    /**
     * Busca um cliente pelo seu ID.
     *
     * @param id o ID do cliente a ser buscado
     * @return um Optional contendo o cliente se encontrado, ou vazio se não encontrado
     */
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }
}
