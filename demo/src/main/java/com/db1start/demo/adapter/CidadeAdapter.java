package com.db1start.demo.adapter;

import com.db1start.demo.domain.entity.Cidade;
import com.db1start.demo.dto.CidadeDTO;

public class CidadeAdapter {
    public static CidadeDTO transformaEntidadeParaDTO(Cidade cidade){
        CidadeDTO dto = new CidadeDTO();
        dto.setNome(cidade.getNome());
        dto.setNomeEstado(cidade.getEstado().getNome());

        return dto;
    }
}
