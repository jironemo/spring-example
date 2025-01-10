package com.jiro.example.repository;
import com.jiro.example.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepository extends JpaRepository<RoomType,Long>{
	
}
