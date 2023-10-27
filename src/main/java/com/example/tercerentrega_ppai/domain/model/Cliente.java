package com.example.tercerentrega_ppai.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Cliente {

    private Long id;

    private Long dni;

    private String nombreCompleto;

    private Long telefono;

}
