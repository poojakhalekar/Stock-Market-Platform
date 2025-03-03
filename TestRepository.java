package com.example.model.repository;  // Ensure this is the correct package name

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.TestEntity;

@Repository
public interface TestRepository extends MongoRepository<TestEntity, String> {
}
