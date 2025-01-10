package com.jiro.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.jiro.example.entity.Room;
import com.jiro.example.service.RoomService;
@RestController
@RequestMapping("")
public class HomeController {
	@Autowired
	RoomService roomService;
	@GetMapping("/all-rooms")
	public ResponseEntity<List<Room>> getAllRooms() {
		
		HttpHeaders h = new HttpHeaders();
		h.set("Content-Type","application/json");
		return new ResponseEntity<List<Room>>(roomService.getAllRooms(),h,HttpStatus.OK);
		
	}
}
