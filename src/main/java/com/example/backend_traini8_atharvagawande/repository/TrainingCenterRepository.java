package com.example.backend_traini8_atharvagawande.repository;

import com.example.backend_traini8_atharvagawande.entities.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Long> {

}
