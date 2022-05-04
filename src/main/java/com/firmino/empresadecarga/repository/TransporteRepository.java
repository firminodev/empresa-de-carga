package com.firmino.empresadecarga.repository;

import com.firmino.empresadecarga.entity.Transporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporteRepository
        extends JpaRepository<Transporte, Long > {

}
