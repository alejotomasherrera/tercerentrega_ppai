package com.example.tercerentrega_ppai.domain.model;

import com.example.tercerentrega_ppai.infrastructure.entity.EncuestaEntity;
import com.example.tercerentrega_ppai.infrastructure.entity.RespuestaPosibleEntity;
import jakarta.persistence.*;

import java.util.List;

public class Pregunta {
    private Long id;

    private String pregunta;

    private List<RespuestaPosibleEntity> respuestasPosibles;

    private List<EncuestaEntity> encuestas;

}
