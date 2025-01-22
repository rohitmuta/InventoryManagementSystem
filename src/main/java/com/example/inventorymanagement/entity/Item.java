package com.example.inventorymanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String description;
    private int quantity;
}
