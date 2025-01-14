package com.jiro.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiro.example.entity.RoomType;
import com.jiro.example.service.RoomTypeService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("room-type")
@CrossOrigin(origins="*")
public class RoomTypeController {
    RoomTypeService roomTypeService;
    public RoomTypeController(@Autowired RoomTypeService roomTypeService){
        this.roomTypeService = roomTypeService;
    }
    @PostMapping("/add")
    public ResponseEntity<Object> addRoomType(@RequestBody RoomType roomType) {
       RoomType rt = roomTypeService.addRoomType(roomType);
       if(rt != null) 
           return ResponseEntity.ok().body(rt);
       else return null;
    }
    
}
