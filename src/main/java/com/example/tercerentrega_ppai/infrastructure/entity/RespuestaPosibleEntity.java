package com.example.tercerentrega_ppai.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class RespuestaPosibleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_posible")
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor")
    private Long valor;

    @ManyToMany(mappedBy = "respuestasPosibles")
    private List<PreguntaEntity> preguntas;

}
