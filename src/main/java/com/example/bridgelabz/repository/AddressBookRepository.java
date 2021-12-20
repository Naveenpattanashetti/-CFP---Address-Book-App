package com.example.bridgelabz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bridgelabz.entity.AddressBookEntity;
@Repository
public interface AddressBookRepository extends CrudRepository<AddressBookEntity, Long> {

}
