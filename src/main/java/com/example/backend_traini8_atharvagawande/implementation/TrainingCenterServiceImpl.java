package com.example.backend_traini8_atharvagawande.implementation;

import com.example.backend_traini8_atharvagawande.entities.TrainingCenter;
import com.example.backend_traini8_atharvagawande.payload.TrainingCenterRequestDto;
import com.example.backend_traini8_atharvagawande.payload.TrainingCenterResponseDto;
import com.example.backend_traini8_atharvagawande.repository.TrainingCenterRepository;
import com.example.backend_traini8_atharvagawande.service.TrainingCenterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TrainingCenterServiceImpl implements TrainingCenterService {
    private final TrainingCenterRepository trainingCenterRepository;

    @Override
    public TrainingCenterResponseDto createTrainingCenter(TrainingCenterRequestDto dto) {
        TrainingCenter trainingCenter=TrainingCenter.builder()
                .centerName(dto.getCenterName())
                .centerCode(dto.getCenterCode())
                .address(dto.getAddress())
                .studentCapacity(dto.getStudentCapacity())
                .courseOffered(dto.getCoursesOffered())
                .contactPhone(dto.getContactPhone())
                .contactEmail(dto.getContactEmail())
                .build();

        TrainingCenter saved=trainingCenterRepository.save(trainingCenter);
        return mapTOResponseDto(saved);
    }

    @Override
    public List<TrainingCenterResponseDto> getAllTrainingCenters() {
        return trainingCenterRepository.findAll().stream()
                .map(this::mapTOResponseDto)
                .collect(Collectors.toList());
    }
    private TrainingCenterResponseDto mapTOResponseDto(TrainingCenter center){
        return TrainingCenterResponseDto.builder()
                .id(center.getId())
                .centerName(center.getCenterName())
                .centerCode(center.getCenterCode())
                .address(center.getAddress())
                .studentCapacity(center.getStudentCapacity())
                .coursesOffered(center.getCourseOffered())
                .createdOn(center.getCreatedOn())
                .contactEmail(center.getContactEmail())
                .contactPhone(center.getContactPhone())
                .build();
    }
}
