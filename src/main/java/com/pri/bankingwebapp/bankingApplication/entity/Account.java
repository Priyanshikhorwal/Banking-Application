package com.pri.bankingwebapp.bankingApplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="account")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="accountHolder")
    private String accountHolderName;
    private double balance;
}
