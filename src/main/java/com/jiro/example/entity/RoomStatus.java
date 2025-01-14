package com.jiro.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "room_status")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long roomStatusId;

    @Column(name = "status")
    private Status status;

    @Column(name = "description")
    private String description;
    
}

enum Status {
    AVAILABLE,
    OCCUPIED,
    RESERVED,
    MAINTENANCE
}

