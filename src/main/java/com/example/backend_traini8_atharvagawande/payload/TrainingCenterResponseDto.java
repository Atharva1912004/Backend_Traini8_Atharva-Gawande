package com.example.backend_traini8_atharvagawande.payload;

import com.example.backend_traini8_atharvagawande.entities.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrainingCenterResponseDto {
    private Long id;
    private String centerName;
    private String centerCode;
    private Address address;
    private Integer studentCapacity;
    private List<String> coursesOffered;
    private Instant createdOn;
    private String contactEmail;
    private String contactPhone;
}
