package com.jiro.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiro.example.entity.RoomType;
import com.jiro.example.repository.RoomTypeRepository;

@Service
public class RoomTypeService {
	@Autowired
	RoomTypeRepository roomTypeRepo;
	
	public Optional<RoomType> getRoomTypeById(Long roomTypeId) {
		return roomTypeRepo.findById(roomTypeId);
	}

	public RoomType addRoomType(RoomType roomType) {
		return roomTypeRepo.save(roomType);
	}
}
