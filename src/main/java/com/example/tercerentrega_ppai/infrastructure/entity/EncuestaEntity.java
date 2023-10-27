package com.example.tercerentrega_ppai.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class EncuestaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_encuesta")
    private Long id;

    @Column(name = "fecha_vigencia_fin")
    private Date fechaVigenciaFin;

    @Column(name = "")

}
