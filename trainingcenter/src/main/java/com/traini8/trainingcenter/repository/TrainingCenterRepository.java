package com.traini8.trainingcenter.repository;

import com.traini8.trainingcenter.entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter, Long> {
}