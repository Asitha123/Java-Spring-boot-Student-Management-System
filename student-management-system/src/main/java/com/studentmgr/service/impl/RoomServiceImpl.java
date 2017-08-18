package com.studentmgr.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmgr.common.service.impl.GenericServiceImpl;
import com.studentmgr.dao.RoomDao;
import com.studentmgr.model.Room;
import com.studentmgr.service.RoomService;

@Service
public class RoomServiceImpl extends GenericServiceImpl<Room> implements RoomService{

	@Autowired
	protected RoomDao roomDao;
	
	@PostConstruct
	void init() {
        init(Room.class, roomDao);
    }
	
}
