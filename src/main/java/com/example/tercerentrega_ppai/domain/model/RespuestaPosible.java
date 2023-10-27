package com.example.tercerentrega_ppai.domain.model;

import com.example.tercerentrega_ppai.infrastructure.entity.PreguntaEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class RespuestaPosible {

    private Long id;

    private String descripcion;

    private Long valor;

    private List<PreguntaEntity> preguntas;


}
