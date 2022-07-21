package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "CUSTOMER_ORDER")
public class Order {
    @Id @GeneratedValue
    private Long id;

    private String description;

    private Status status;


    public Order(String description, Status status) {
        this.description = description;
        this.status = status;
    }
}
