package com.db1start.demo.controller;

import com.db1start.demo.adapter.EstadoAdapter;
import com.db1start.demo.domain.entity.Estado;
import com.db1start.demo.dto.EstadoDTO;
import com.db1start.demo.dto.EstadoFormDTO;
import com.db1start.demo.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estados")
    public List<EstadoDTO> buscarTodosEstados() {
        List<Estado> estados = estadoService.buscarTodos();
        List<EstadoDTO> listaDeRetorno = new ArrayList<>();
        estados.forEach(estado -> {
            EstadoDTO meuEstadoDTO = EstadoAdapter.transformaEntidadeParaDTO(estado);
            listaDeRetorno.add(meuEstadoDTO);
        });
        return listaDeRetorno;
    }

    @PostMapping("/estado")
    public void cadastrarNovoEstado(@RequestBody EstadoFormDTO formDTO){
        estadoService.criar(formDTO.getNome());
    }

    @PutMapping("/estado/{estadoId}")
    public void atualizaEstado(@PathVariable Long estadoId, @RequestBody EstadoFormDTO form){
        estadoService.atualizar(estadoId,form);
    }

    @DeleteMapping("/estado/{estadoId}")
    public void deletarEstado(@PathVariable Long estadoId){
        estadoService.deletarPorId(estadoId);
    }
}
