package com.Q8.SpringRest8.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Q8.SpringRest8.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product,String>  {

}
