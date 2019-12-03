package com.db1start.demo.controller;

import com.db1start.demo.domain.entity.Agencia;
import com.db1start.demo.dto.AgenciaDTO;
import com.db1start.demo.service.AgenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgenciaController {

    @Autowired
    public AgenciaService agenciaService;

    @GetMapping("/agencia")
    public List<AgenciaDTO> buscarTodasAgencias;



}
