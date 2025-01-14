package com.jiro.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiro.example.entity.RoomStatus;
import com.jiro.example.repository.RoomStatusRepository;

@Service
public class RoomStatusService {

    RoomStatusRepository roomStatusRepo;
    public RoomStatusService(@Autowired RoomStatusRepository roomStatusRepo){ this.roomStatusRepo = roomStatusRepo;}    


    public RoomStatus getRoomStatusById(long id) {
        return roomStatusRepo.findById(id).orElse(null);
    }

    public RoomStatus addRoomStatus(RoomStatus roomStatus) {
        return roomStatusRepo.save(roomStatus);
    }
}
