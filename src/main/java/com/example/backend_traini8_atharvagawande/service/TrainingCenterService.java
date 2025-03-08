package com.example.backend_traini8_atharvagawande.service;

import com.example.backend_traini8_atharvagawande.payload.TrainingCenterRequestDto;
import com.example.backend_traini8_atharvagawande.payload.TrainingCenterResponseDto;

import java.util.List;

public interface TrainingCenterService {
    TrainingCenterResponseDto createTrainingCenter(TrainingCenterRequestDto dto);
    List<TrainingCenterResponseDto> getAllTrainingCenters();
}
