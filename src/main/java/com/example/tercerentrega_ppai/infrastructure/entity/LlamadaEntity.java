package com.example.tercerentrega_ppai.infrastructure.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class LlamadaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_llamada")
    private Long id;

    @Column(name = "fecha_llamada")
    private Date fechaLlamada;

    @Column(name = "descripcion_llamada")
    private String descripcionLlamada;

    @Column(name = "detalle_accion_requerida")
    private String detalleAccionRequerida;

    @Column(name = "encuesta_enviada")
    private Boolean encuestaEnviada;

    @Column(name = "observacion_auditoria")
    private String observacionAuditoria;

    //relacion con cambio de estado
    @OneToOne
    @JoinColumn(name = "id_cambio_estado")
    private CambioEstadoEntity cambioEstado;

    //relacion con la respuesta del cliente
    @OneToOne
    @JoinColumn(name = "id_respuesta_cliente")
    private RespuestaClienteEntity respuestaCliente;

    //relacion con el cliente
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntity cliente;


}
