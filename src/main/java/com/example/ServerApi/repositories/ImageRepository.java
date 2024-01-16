package com.example.ServerApi.repositories;

import com.example.ServerApi.models.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {}