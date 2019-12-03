package com.db1start.demo.controller;

import com.db1start.demo.adapter.ContaAdapter;
import com.db1start.demo.domain.entity.Conta;
import com.db1start.demo.dto.ContaDTO;
import com.db1start.demo.dto.ContaFormDTO;
import com.db1start.demo.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ContaController {

    @Autowired
    public ContaService contaService;

    @GetMapping("/conta")
    public List<ContaDTO> buscarTodasContas(){
        List<Conta> contas = contaService.buscarTodos();
        List<ContaDTO> listaDeRetorno = new ArrayList<>();
        contas.forEach(conta -> {
            ContaDTO minhaContaDTO = ContaAdapter.transformaEntidadeParaDTO(conta);
            listaDeRetorno.add(minhaContaDTO);
        });
        return listaDeRetorno;
    }

    @PostMapping("/conta")
    public void cadastrarNovaConta(@RequestBody ContaFormDTO formDTO){
        contaService.criar(formDTO.getSaldo(),formDTO.getAgenciaId(),formDTO.getClienteId());
    }

}
