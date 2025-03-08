package com.example.backend_traini8_atharvagawande.payload;


import jakarta.validation.constraints.*;
import lombok.*;
import  com.example.backend_traini8_atharvagawande.entities.Address;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrainingCenterRequestDto {
    @NotBlank
    @Size(max=40)
    private String centerName;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;
    @NotNull
    private Address address;

    private List<String> coursesOffered;
    @Min(1)
    private Integer studentCapacity;

    @Email
    private String contactEmail;
    @NotBlank
    @Pattern(regexp = "^[6-9]\\d{9}$")
    private String contactPhone;
}
