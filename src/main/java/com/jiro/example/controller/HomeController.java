package com.jiro.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.jiro.example.entity.Room;
import com.jiro.example.dto.RoomDTO;
import com.jiro.example.service.RoomService;


@RestController
@RequestMapping("")
public class HomeController {
	@Autowired
	RoomService roomService;
	

	HttpHeaders h = new HttpHeaders();
	public HomeController() {

		h.set("Content-Type","application/json");
	}
	@GetMapping("/all-rooms")
	public ResponseEntity<List<Room>> getAllRooms() {
		
		return new ResponseEntity<List<Room>>(roomService.getAllRooms(),h,HttpStatus.OK);
	}
	
	
	@PostMapping("/new")
	public ResponseEntity<Room> createRoom(@RequestBody RoomDTO roomDTO){
		Room room = roomService.addRoom(roomDTO);
		ResponseEntity<Room> res;
		if(room != null) {

			res = new ResponseEntity<Room>(room,h,HttpStatus.OK);
		}else {res = new ResponseEntity<Room>(room,h,HttpStatus.OK);
		}return res;
	}
}
