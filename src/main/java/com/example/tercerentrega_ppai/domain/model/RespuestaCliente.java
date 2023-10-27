package com.example.tercerentrega_ppai.domain.model;

import com.example.tercerentrega_ppai.infrastructure.entity.RespuestaPosibleEntity;
import jakarta.persistence.*;

import java.util.Date;

public class RespuestaCliente {
    private Long id;

    private Date fechaEncuesta;

    private RespuestaPosibleEntity respuestaPosible;

}
