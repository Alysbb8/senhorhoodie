package com.db1start.demo.controller;

import com.db1start.demo.adapter.CidadeAdapter;
import com.db1start.demo.domain.entity.Cidade;
import com.db1start.demo.dto.CidadeDTO;
import com.db1start.demo.dto.CidadeFormDTO;
import com.db1start.demo.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CidadeController {

    @Autowired
    public CidadeService cidadeService;

    @GetMapping("/cidade")
    public List<CidadeDTO> buscarAsCidades(){
        List<Cidade> cidades = cidadeService.buscarTodos();
        List<CidadeDTO> listaDeRetorno = new ArrayList<>();
        cidades.forEach(cidade -> {
            CidadeDTO minhaCidadeDTO = CidadeAdapter.transformaEntidadeParaDTO(cidade);
            listaDeRetorno.add(minhaCidadeDTO);
        });
        return listaDeRetorno;
    }

    @PostMapping("/cidades")
    public void cadastrarCidades(@RequestBody CidadeFormDTO formDTO){
        cidadeService.criar(formDTO.getNome(),formDTO.getEstadoId());
    }

}
