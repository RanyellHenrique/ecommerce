package com.ecommerce.hrcatalog.services;

import com.ecommerce.hrcatalog.Entities.Category;
import com.ecommerce.hrcatalog.dtos.CategoryDTO;
import com.ecommerce.hrcatalog.repositories.CategoryRepository;
import com.ecommerce.hrcatalog.services.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public CategoryDTO findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        Category category = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found " + id));
        CategoryDTO categoryDTO = modelMapper.map(category, CategoryDTO.class);
        return categoryDTO;
    }

    public List<CategoryDTO> findAll() {
        List<Category> list = repository.findAll();
        List<CategoryDTO> listDto = list.stream()
                .map(p -> modelMapper.map(p, CategoryDTO.class))
                .collect(Collectors.toList());
        return listDto;
    }
}
