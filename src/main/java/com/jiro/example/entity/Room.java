package com.jiro.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name="room")
@Getter
@Setter
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	Long id;
	
	@Column(name = "room_no")
	String room_no;

	@JoinColumn(name = "room_type_id",nullable = false,updatable = true,insertable = true,unique = false)
	@ManyToOne(targetEntity = RoomType.class,cascade = CascadeType.ALL)
	RoomType roomType;


	@JoinColumn(name="room_status_id",nullable = false,updatable = true,insertable = true,unique = false)
	@ManyToOne(targetEntity = RoomStatus.class,cascade = CascadeType.ALL)
	RoomStatus roomStatus;
	

}
