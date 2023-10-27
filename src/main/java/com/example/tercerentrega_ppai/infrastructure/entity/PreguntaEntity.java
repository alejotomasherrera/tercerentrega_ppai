package com.example.tercerentrega_ppai.infrastructure.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class PreguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pregunta")
    private Long id;

    private String pregunta;

    @ManyToMany
    @JoinTable(name = "pregunta_respuestaPosible"
            , joinColumns = @jakarta.persistence.JoinColumn(name = "id_pregunta")
            , inverseJoinColumns = @jakarta.persistence.JoinColumn(name = "id_respuestaPosible")
    )
    private List<RespuestaPosibleEntity> respuestasPosibles;




}
