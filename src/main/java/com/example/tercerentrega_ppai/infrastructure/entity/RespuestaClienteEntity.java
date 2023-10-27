package com.example.tercerentrega_ppai.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class RespuestaClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_respuesta_cliente")
    private Long id;

    @Column(name = "fecha_encuesta")
    private Date fechaEncuesta;


    //Relacione con RespuestaPosibleEntity
    @ManyToOne
    @JoinColumn(name = "id_respuesta_posible")
    private RespuestaPosibleEntity respuestaPosible;

}
