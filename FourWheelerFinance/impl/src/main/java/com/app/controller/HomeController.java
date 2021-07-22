package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.app.dto.Student;
import com.app.icontroller.IHomeController;

@Controller
public class HomeController implements IHomeController {

	public ResponseEntity<Student> hello() {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.setId(1);
		stu.setName("AVI");
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
	}

	

}
