package com.priyanshi.xyz.hotelManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;

@Entity
@Data
public class patient {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dob;
    private String address;
    private String email;
    private long phoneNumber;
    private String gender;


}
