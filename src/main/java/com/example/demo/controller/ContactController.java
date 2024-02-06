package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Contact;
//import com.example.demo.model.User;
import com.example.demo.repository.ContactRepository;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
@Autowired
ContactRepository conrepo;

@GetMapping("/all")
public List<Contact> getList(){
	return conrepo.findAll();
}
@PostMapping("/insertcontact")
public Contact insertContact(@RequestBody Contact c) {
	return conrepo.save(c);
}
}
