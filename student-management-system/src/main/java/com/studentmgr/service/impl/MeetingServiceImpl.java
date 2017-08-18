package com.studentmgr.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmgr.common.service.impl.GenericServiceImpl;
import com.studentmgr.dao.MeetingDao;
import com.studentmgr.model.Meeting;
import com.studentmgr.service.MeetingService;

@Service
public class MeetingServiceImpl extends GenericServiceImpl<Meeting> implements MeetingService{

	@Autowired
	protected MeetingDao meetingDao;
	
	@PostConstruct
	void init() {
        init(Meeting.class, meetingDao);
    }
	
}
