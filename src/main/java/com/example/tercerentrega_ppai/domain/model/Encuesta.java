package com.example.tercerentrega_ppai.domain.model;

import com.example.tercerentrega_ppai.infrastructure.entity.PreguntaEntity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class Encuesta {

    private Long id;

    private Date fechaVigenciaFin;

    private String descripcion;

    private List<PreguntaEntity> preguntas;
}
