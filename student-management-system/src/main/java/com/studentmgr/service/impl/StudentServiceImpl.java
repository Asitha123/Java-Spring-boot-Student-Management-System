package com.studentmgr.service.impl;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmgr.common.service.impl.GenericServiceImpl;
import com.studentmgr.dao.StudentDao;
import com.studentmgr.model.Student;
import com.studentmgr.service.StudentService;

@Service
public class StudentServiceImpl extends GenericServiceImpl<Student> implements StudentService{

	@Autowired
	protected StudentDao studentDao;
	
	@PostConstruct
	void init() {
        init(Student.class, studentDao);
    }
	
}
