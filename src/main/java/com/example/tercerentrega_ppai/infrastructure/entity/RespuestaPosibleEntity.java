package com.example.tercerentrega_ppai.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class RespuestaPosibleEntity {

    @Id
    private Long id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor")
    private Long valor;

    @ManyToMany
    @JoinTable(
            name = "pregunta_respuesta_posible",
            joinColumns = @JoinColumn(name = "id_respuesta_posible"),
            inverseJoinColumns = @JoinColumn(name = "id_pregunta")
    )
    private PreguntaEntity pregunta;

}
