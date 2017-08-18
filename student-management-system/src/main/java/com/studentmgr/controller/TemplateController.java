package com.studentmgr.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentmgr.common.exception.ServiceException;
import com.studentmgr.model.Student;
import com.studentmgr.service.StudentService;

@Controller
public class TemplateController {

	private static final Logger LOG = LoggerFactory.getLogger(TemplateController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String listPage(Model model){
		
		List<Student> students = new ArrayList<>();
		try{
			students = studentService.getAll();
		}catch(Exception e){
			LOG.error(e.getMessage());
		}
		
		model.addAttribute("students", students);
		
		return "list";
	}
	
	@RequestMapping("/save")
	public String savePage(@RequestParam(value="q", required=false) String id, Model model) throws ServiceException{
		
		Student student = null;
		if(!StringUtils.isEmpty(id))
			student = studentService.getById(id);
			
		model.addAttribute("genderList", Arrays.asList(Student.GENDER_MALE, Student.GENDER_FEMALE));
		model.addAttribute("student", student);
		return "save";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveBooking(@ModelAttribute Student student) throws ServiceException{
		
		if(StringUtils.isEmpty(student.getId())){
			student.setId(null);
			studentService.add(student);
		}
		else
			studentService.edit(student);
		
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String deleteBooking(@ModelAttribute Student student) throws ServiceException{
		studentService.delete(student);
		return "redirect:/";
	}
	
}
