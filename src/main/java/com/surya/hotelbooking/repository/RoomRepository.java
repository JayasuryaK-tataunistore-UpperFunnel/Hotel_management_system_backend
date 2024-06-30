package com.surya.hotelbooking.repository;

import com.surya.hotelbooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room , Long> {

    @Query("SELECT DISTINCT r.roomType FROM Room r")
    //here it is not ROOM it does not represent table in sql it represents Room entity it our java code Room in model as it is an orm mapping to the room table to the dql room table
    //similar with room_type in sql <=> roomType in Room model orm to sql room table
    List<String> findDistinctRoomTypes();



}
