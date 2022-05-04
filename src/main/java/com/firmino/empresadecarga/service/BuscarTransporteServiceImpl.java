package com.firmino.empresadecarga.service;

import com.firmino.empresadecarga.entity.Transporte;
import com.firmino.empresadecarga.repository.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscarTransporteServiceImpl {
    @Autowired
    private TransporteRepository transporteRepository;

    public List<Transporte> buscarTodosOsTransporte() {
        List<Transporte> listTransporte = transporteRepository.findAll();
        return listTransporte;
    }
}
