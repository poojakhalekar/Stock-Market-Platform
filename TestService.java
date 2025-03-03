package com.example.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.TestEntity;
import com.example.model.repository.TestRepository;

@Service
public class TestService {
    
    @Autowired
    private TestRepository testRepository;

    // Create a new document
    public TestEntity saveTestEntity(TestEntity testEntity) {
        return testRepository.save(testEntity);
    }

    // Get all documents
    public List<TestEntity> getAllTestEntities() {
        return testRepository.findAll();
    }

    // Get a document by ID
    public Optional<TestEntity> getTestEntityById(String id) {
        return testRepository.findById(id);
    }

    // Delete a document by ID
    public void deleteTestEntity(String id) {
        testRepository.deleteById(id);
    }
}
