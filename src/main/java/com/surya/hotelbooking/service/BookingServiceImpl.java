package com.surya.hotelbooking.service;


import com.surya.hotelbooking.model.BookedRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{
    @Override
    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return null;
    }
}
