package com.example.backend_traini8_atharvagawande.controller;

import com.example.backend_traini8_atharvagawande.payload.TrainingCenterRequestDto;
import com.example.backend_traini8_atharvagawande.payload.TrainingCenterResponseDto;
import com.example.backend_traini8_atharvagawande.service.TrainingCenterService;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")

public class TrainingCenterController {
    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping("/training-center")
    public TrainingCenterResponseDto createTrainingCenter(@Valid @RequestBody TrainingCenterRequestDto dto){
        return service.createTrainingCenter(dto);
    }
    @GetMapping
    public List<TrainingCenterResponseDto> getAllTrainingCenters(){
        return service.getAllTrainingCenters();
    }
}
