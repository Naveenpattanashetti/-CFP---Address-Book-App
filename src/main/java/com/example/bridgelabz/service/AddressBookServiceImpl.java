package com.example.bridgelabz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bridgelabz.entity.AddressBookEntity;
import com.example.bridgelabz.model.AddressBookModel;
import com.example.bridgelabz.model.Response;
import com.example.bridgelabz.repository.AddressBookRepository;




@Service
public class AddressBookServiceImpl implements AddressBookService {

	@Autowired
	private AddressBookRepository addressBookRepository;

	@Override
	public Response saveContacts(AddressBookModel contactInfo) {
		AddressBookEntity address=new AddressBookEntity();
		address.setFirstName(contactInfo.getFirstName());
		address.setLastName(contactInfo.getLastName());
		address.setPhone(contactInfo.getPhone());
		address.setState(contactInfo.getState());
		address.setAddress(contactInfo.getAddress());
		address.setCity(contactInfo.getCity());
		address.setZip(contactInfo.getZip());		
		addressBookRepository.save(address);
		return new  Response(200 ,"Contact added Successfully..!!");
	}

	@Override
	public Response getContactByID(Long Id) {
		Optional<AddressBookEntity> contact=addressBookRepository.findById(Id);
		return  new  Response(200 ,"Retrived Contact Details succesfully..!!",contact);
	}

	@Override
	public Response updateContactByID(Long Id,AddressBookModel contactInfo) {
		Optional<AddressBookEntity> contact=addressBookRepository.findById(Id);
		if(contact.isPresent()) {
			AddressBookEntity address=new AddressBookEntity();
			address.setFirstName(contactInfo.getFirstName());
			address.setLastName(contactInfo.getLastName());
			address.setPhone(contactInfo.getPhone());
			address.setState(contactInfo.getState());
			address.setAddress(contactInfo.getAddress());
			address.setCity(contactInfo.getCity());
			address.setZip(contactInfo.getZip());		
			addressBookRepository.save(address);
			addressBookRepository.save(address);
			return new  Response(200 ,"Conatct Details Updated Succesfully..!!"); 
		}
 		  return new  Response(500 ,"Fail to update the Contact Detail!"); 
	}

	@Override
	public Response deleteContactByID(Long Id) {
		addressBookRepository.deleteById(Id);
		return new  Response(200 ,"Conatct Details Deleted Succesfully..!!");
	}

	@Override
	public  Response getAllContact() {
		List<AddressBookEntity> contacts=  (List<AddressBookEntity>) addressBookRepository.findAll();
		 
		return new  Response(200 ,"Conatct Details Deleted Succesfully..!!",contacts);
	}
}
