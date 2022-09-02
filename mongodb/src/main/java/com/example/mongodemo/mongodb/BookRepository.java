package com.example.mongodemo.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



public interface BookRepository  extends MongoRepository<Book, Integer>{

}
