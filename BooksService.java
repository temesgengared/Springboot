package com.lemlem.restaurant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class BooksService {
  @Autowired
  BooksRepository bookRepository;
   
    public   Optional<Books> getBookByID(Long id){
	return bookRepository.findById(id);
}

	public Books saveBook(Books book) {
		// TODO Auto-generated method stub
		return null;
	}
}
