package com.example.tercerentrega_ppai.infrastructure.dao;

import com.example.tercerentrega_ppai.infrastructure.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPreguntaDao extends JpaRepository<PreguntaEntity, Integer> {
}
