package com.financial.management.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    // Using BigDecimal for financial values is a best practice
    private BigDecimal amount;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private TransactionType type;


}
