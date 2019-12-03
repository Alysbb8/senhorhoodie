package com.db1start.demo.adapter;

import com.db1start.demo.domain.entity.Conta;
import com.db1start.demo.dto.ContaDTO;

public class ContaAdapter {
    public static ContaDTO transformaEntidadeParaDTO(Conta conta){
        ContaDTO dto = new ContaDTO();
        dto.setAgencia(conta.getAgencia());
        dto.setId(conta.getId());
        dto.setSaldo(conta.getSaldo());
        return dto;
    }
}
