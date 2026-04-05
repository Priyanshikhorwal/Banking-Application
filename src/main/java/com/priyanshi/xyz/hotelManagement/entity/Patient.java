package com.priyanshi.xyz.hotelManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Past
    private LocalDate dob;
    @NotNull
    @Max(100)
    private String address;
    @Email
    @NotBlank
    private String email;
    @Size(min=10, max=10)
    private long phoneNumber;
    @NotNull
    private String gender;


}
