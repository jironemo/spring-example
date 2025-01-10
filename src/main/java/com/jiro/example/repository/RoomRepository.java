package com.jiro.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jiro.example.entity.Room;
public interface RoomRepository extends JpaRepository<Room,Long>{

}
