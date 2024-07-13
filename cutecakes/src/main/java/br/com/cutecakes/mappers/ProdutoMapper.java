package br.com.cutecakes.mappers;

import br.com.cutecakes.dtos.ProdutoDTO;
import br.com.cutecakes.entities.Produto;

/**
 * Classe utilitária para mapear entre a entidade Produto e o DTO ProdutoDTO.
 */
public class ProdutoMapper {

    /**
     * Converte um Produto em um ProdutoDTO.
     *
     * @param produto o produto a ser convertido
     * @return o ProdutoDTO resultante
     */
    public static ProdutoDTO toDTO(Produto produto) {
        ProdutoDTO dto = new ProdutoDTO();
        dto.setId(produto.getId());
        dto.setNome(produto.getNome());
        dto.setDescricao(produto.getDescricao());
        dto.setPreco(produto.getPreco());
        return dto;
    }

    /**
     * Converte um ProdutoDTO em um Produto.
     *
     * @param dto o ProdutoDTO a ser convertido
     * @return o Produto resultante
     */
    public static Produto toEntity(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setId(dto.getId());
        produto.setNome(dto.getNome());
        produto.setDescricao(dto.getDescricao());
        produto.setPreco(dto.getPreco());
        return produto;
    }
}
