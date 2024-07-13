package br.com.cutecakes.mappers;

import br.com.cutecakes.dtos.ClienteDTO;
import br.com.cutecakes.entities.Cliente;

/**
 * Classe utilitária para mapear entre a entidade Cliente e o DTO ClienteDTO.
 */
public class ClienteMapper {

    /**
     * Converte um Cliente em um ClienteDTO.
     *
     * @param cliente o cliente a ser convertido
     * @return o ClienteDTO resultante
     */
    public static ClienteDTO toDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getId());
        dto.setNome(cliente.getNome());
        dto.setEmail(cliente.getEmail());
        dto.setTelefone(cliente.getTelefone());
        return dto;
    }

    /**
     * Converte um ClienteDTO em um Cliente.
     *
     * @param dto o ClienteDTO a ser convertido
     * @return o Cliente resultante
     */
    public static Cliente toEntity(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefone(dto.getTelefone());
        return cliente;
    }
}
