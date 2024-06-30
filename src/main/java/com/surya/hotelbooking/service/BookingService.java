package com.surya.hotelbooking.service;

import com.surya.hotelbooking.model.BookedRoom;

import java.util.List;

public interface BookingService {
     List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
