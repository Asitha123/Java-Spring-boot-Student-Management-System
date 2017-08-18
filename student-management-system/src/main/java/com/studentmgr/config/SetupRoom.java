package com.studentmgr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studentmgr.common.exception.ServiceException;
import com.studentmgr.model.Room;
import com.studentmgr.service.RoomService;

@Component
public class SetupRoom {

	@Autowired
	public SetupRoom(RoomService roomService) {
		
		Room r1 = new Room();
		r1.setId("r1");
		
		Room r2 = new Room();
		r2.setId("r2");
		
		Room r3 = new Room();
		r3.setId("r3");
		
		Room r4 = new Room();
		r4.setId("r4");
		
		try {
			roomService.add(r1);
			roomService.add(r2);
			roomService.add(r3);
			roomService.add(r4);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
	}
	
}
