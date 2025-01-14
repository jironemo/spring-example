package com.jiro.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiro.example.entity.RoomStatus;
import com.jiro.example.service.RoomStatusService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("room-status")
@CrossOrigin(origins = "*")
public class RoomStatusController {
    @Autowired RoomStatusService roomStatusService;

    public RoomStatusController(@Autowired RoomStatusService roomStatusService) {
        this.roomStatusService = roomStatusService;
    }
    @PostMapping("/add")
    public ResponseEntity<Object> addNewStatus(@RequestBody RoomStatus roomStatus) {
        RoomStatus r = roomStatusService.addRoomStatus(roomStatus);
        if(r != null)
            return ResponseEntity.ok(r);
        else return ResponseEntity.badRequest().body("Error adding room status");
    }
}
