package com.example.tercerentrega_ppai.infrastructure.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PreguntaEntity {

    @Id
    private Long id;

    private String nombre;




}
