package com.example.backend_traini8_atharvagawande.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.Instant;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Center name is required")
    @Size(max = 40,message = "Center name must be less than 40 characters")
    private String centerName;
    @NotBlank(message = "Center code is required")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}",message = "Center code must be exactly 12 alphanumeric character")
    private String centerCode;
    @Embedded
    private Address address;
    @Min(value=1,message = "Student capacity must be at least 1")
    private Integer studentCapacity;
    @ElementCollection
    private List<String> courseOffered;
    @CreationTimestamp
    @Column(updatable = false)
    private Instant createdOn;
    @Email(message = "Invalid email format")
    private String contactEmail;
    @NotBlank(message = "Contact phone is required")
    @Pattern(regexp = "^[6-9]\\d{9}$",message = "Invalid phone number format")
    private String contactPhone;




}
