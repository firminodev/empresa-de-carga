package com.firmino.empresadecarga.service;

import com.firmino.empresadecarga.entity.Transporte;
import com.firmino.empresadecarga.exception.TransporteNotfoundException;
import com.firmino.empresadecarga.repository.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class buscarTransporteserviceImp {

    @Autowired
    private TransporteRepository transporteRepository;

    public Transporte buscarPorId(Long id) throws TransporteNotfoundException {
        Optional<Transporte> optionalTransporte =transporteRepository.findById(id);

        Transporte transporte =null;

        if (!optionalTransporte.isPresent()) {
        throw new TransporteNotfoundException("transporte nao encontrado:" + id);
        }else {
            transporte = optionalTransporte.get();
        }
        return transporte;
    }
    public void deletarporId(long id) {
        transporteRepository.deleteById(id);

    }
}
