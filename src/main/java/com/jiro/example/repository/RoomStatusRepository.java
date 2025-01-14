package com.jiro.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiro.example.entity.RoomStatus;

public interface RoomStatusRepository  extends JpaRepository<RoomStatus, Long> {
    
}
