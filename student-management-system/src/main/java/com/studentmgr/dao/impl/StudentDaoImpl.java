package com.studentmgr.dao.impl;

import org.springframework.stereotype.Repository;

import com.studentmgr.common.dao.impl.GenericDaoImpl;
import com.studentmgr.dao.StudentDao;
import com.studentmgr.model.Student;

@Repository
public class StudentDaoImpl extends GenericDaoImpl<Student> implements StudentDao {

	public StudentDaoImpl() {
		super(Student.class);
	}
}
