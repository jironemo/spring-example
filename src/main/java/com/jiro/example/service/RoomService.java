package com.jiro.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiro.example.dto.RoomDTO;
import com.jiro.example.entity.Room;
import com.jiro.example.entity.RoomStatus;
import com.jiro.example.entity.RoomType;
import com.jiro.example.repository.RoomRepository;
@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepo;
	
	@Autowired
	private RoomTypeService roomTypeService;
	@Autowired
	private RoomStatusService roomStatusService;
	
	public List<Room> getAllRooms(){
		return roomRepo.findAll();
	}
	public Room addRoom(RoomDTO roomDTO) {
		Room r = new Room();
		r.setRoom_no(roomDTO.getRoomNumber());
		Optional<RoomType> rt_opt = roomTypeService.getRoomTypeById(roomDTO.getRoomTypeId());
		RoomStatus rs = roomStatusService.getRoomStatusById(roomDTO.getRoomStatusId());
		if(rt_opt.isPresent() && rs != null) {
			r.setRoomType(rt_opt.get());	
			r.setRoomStatus(rs);
		}else return null;

		return roomRepo.save(r);
	}

}
