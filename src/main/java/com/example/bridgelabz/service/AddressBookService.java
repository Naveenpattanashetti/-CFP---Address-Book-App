package com.example.bridgelabz.service;

import com.example.bridgelabz.model.AddressBookModel;
import com.example.bridgelabz.model.Response;

public interface AddressBookService {
	


	public Response saveContacts(AddressBookModel contactInfo);
	public Response getContactByID(Long Id);
	public Response updateContactByID(Long Id,AddressBookModel contactInfo);
	public Response deleteContactByID(Long Id);
	public  Response getAllContact();


}
