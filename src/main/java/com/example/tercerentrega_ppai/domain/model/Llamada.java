package com.example.tercerentrega_ppai.domain.model;

import com.example.tercerentrega_ppai.infrastructure.entity.CambioEstadoEntity;
import com.example.tercerentrega_ppai.infrastructure.entity.ClienteEntity;
import com.example.tercerentrega_ppai.infrastructure.entity.RespuestaClienteEntity;
import jakarta.persistence.*;

import java.util.Date;

public class Llamada {

    private Long id;

    private Date fechaLlamada;

    private String descripcionLlamada;

    private String detalleAccionRequerida;

    private Boolean encuestaEnviada;

    private String observacionAuditoria;

    private CambioEstadoEntity cambioEstado;

    private RespuestaClienteEntity respuestaCliente;

    private ClienteEntity cliente;

}
