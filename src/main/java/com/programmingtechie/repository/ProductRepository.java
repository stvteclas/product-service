package com.programmingtechie.repository;

import com.programmingtechie.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <Product, String> {
}
