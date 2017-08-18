package com.studentmgr.dao.impl;

import org.springframework.stereotype.Repository;

import com.studentmgr.common.dao.impl.GenericDaoImpl;
import com.studentmgr.dao.MeetingDao;
import com.studentmgr.model.Meeting;

@Repository
public class MeetingDaoImpl extends GenericDaoImpl<Meeting> implements MeetingDao {

	public MeetingDaoImpl() {
		super(Meeting.class);
	}
}
