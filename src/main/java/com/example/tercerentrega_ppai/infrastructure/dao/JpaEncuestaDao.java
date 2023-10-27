package com.example.tercerentrega_ppai.infrastructure.dao;

import com.example.tercerentrega_ppai.infrastructure.entity.EncuestaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEncuestaDao extends JpaRepository<EncuestaEntity, Integer> {
}
