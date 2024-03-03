package com.example.shopproject.application.caregory;

import com.example.shopproject.domain.entity.Category;
import com.example.shopproject.presentation.exception.EntityNotFoundException;
import com.example.shopproject.infrastructure.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository repository;

    public List<Category> getAll() {
        return repository.findAll();
    }

    public Category getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Category with id " + id + " not found"));    }

    public Category create(Category categoryFromCommand) {
        return repository.save(categoryFromCommand);
    }

    public Category update(Long id, Category categoryFromCommand) {
        Category category = getById(id);



        return repository.save(category);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}