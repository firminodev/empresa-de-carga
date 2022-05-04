package com.firmino.empresadecarga.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "transporte")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name ="nome")
    public String carga;
    @Column (name = "cidade")
    public String cidade;
    @Column (name = "distancia")
    public Long distancia;



}
