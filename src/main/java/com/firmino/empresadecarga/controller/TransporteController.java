package com.firmino.empresadecarga.controller;

import com.firmino.empresadecarga.entity.Transporte;
import com.firmino.empresadecarga.repository.TransporteRepository;
import com.firmino.empresadecarga.service.BuscarTransporteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/v1")
@RestController
public class TransporteController {
    @Autowired
    private TransporteRepository transporteRepository;

    @Autowired
    private BuscarTransporteServiceImpl serviceBuscar;

    @Autowired
    private  BuscarTransporteServiceImpl serviceBuscarPorId;

    @GetMapping
    public List<Transporte> listaTransporte() {
        return transporteRepository.findAll();
    }


    @PostMapping
    public String salvaTransporte(@RequestBody Transporte transporte) {
        transporteRepository.save(transporte);
        return "online";
    }

    @DeleteMapping(path = "transporte/delete/{id}")
    public void deleteTransporte(
        @PathVariable(name = "id", required = true) Long id) {
        transporteRepository.deleteById(id);
    }

}
