package com.example.tercerentrega_ppai.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

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

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToMany
    @JoinTable(name = "encuesta_pregunta"
            , joinColumns = @JoinColumn(name = "id_encuesta")
            , inverseJoinColumns = @JoinColumn(name = "id_pregunta")
    )
    private List<PreguntaEntity> preguntas;

}
