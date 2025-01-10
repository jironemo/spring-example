package com.jiro.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jiro.example.entity.Room;
import com.jiro.example.repository.RoomRepository;
@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepo;
	
	public List<Room> getAllRooms(){
		return roomRepo.findAll();
	}
}
