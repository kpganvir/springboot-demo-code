package com.example.mongodemo.mongodb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController  {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/add")
	public String saveBook(@RequestBody  Book book)
	{
		
		System.out.println("book is "+book.toString());
		Book s=repository.save(book);
		return "book added";
		
	}

	@GetMapping("/get/{id}")
	public Optional<Book> getBook(@PathVariable int id)
	{
		return repository.findById(id);
		
		
	}
	
	@GetMapping("/get/all")
	public List<Book> getAllBook()
	{
		return repository.findAll();
		
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		repository.deleteById(id);
		return "book delted";
		
	}
	

}
