package com.app.icontroller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dto.Student;

@Controller
@RequestMapping("/api")
public interface IHomeController {

	@GetMapping("/hello")
	public ResponseEntity<Student> hello();
}
