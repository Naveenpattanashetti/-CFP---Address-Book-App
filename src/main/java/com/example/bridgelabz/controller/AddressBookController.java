package com.example.bridgelabz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bridgelabz.model.AddressBookModel;
import com.example.bridgelabz.model.Response;
import com.example.bridgelabz.service.AddressBookServiceImpl;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/addressBook")
@Slf4j
public class AddressBookController {
	@Autowired
	private AddressBookServiceImpl addressBookServiceImpl;


	@PostMapping("/savecontacts")
	public ResponseEntity<Response> saveContacts(@Valid @RequestBody AddressBookModel contactInfo) {
		log.info("save method is called ");
		Response response = addressBookServiceImpl.saveContacts(contactInfo);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/getContactsId")
	public ResponseEntity<Response> getContactByID(@RequestParam Long Id) {
		log.info("Get the contact details by Id  {}", Id);
		Response response = addressBookServiceImpl.getContactByID(Id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/getAllContacts")
	public ResponseEntity<Response> getAllContact () {
		log.info("Get all contact details ");
		Response response = addressBookServiceImpl.getAllContact();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping("/updateContactId")
	public ResponseEntity<Response> updateContactByID(@RequestParam Long Id,@Valid  @RequestBody AddressBookModel contactInfo) {
		log.info("update contact details ");
		Response response = addressBookServiceImpl.updateContactByID(Id, contactInfo);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@DeleteMapping("/deleteContactId")
	public ResponseEntity<Response> deleteContactByID(@RequestParam Long Id) {
		log.info("Deelet contact details ");
		Response response = addressBookServiceImpl.deleteContactByID(Id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
