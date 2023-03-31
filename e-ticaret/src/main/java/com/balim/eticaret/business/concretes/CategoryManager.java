package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.CategoryService;
import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.request.UpdateCategoryRequest;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import com.balim.eticaret.core.utilities.mappers.ModelMapperService;
import com.balim.eticaret.dataAccess.abstracts.CategoryRepository;
import com.balim.eticaret.entitiy.Category;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    private CategoryRepository categoryRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void add(CreateCategoryRequest createCategoryRequest) {
         Category category= this.modelMapperService.forRequest().map(createCategoryRequest,Category.class);
         this.categoryRepository.save(category);

    }

    @Override
    public void upDate(UpdateCategoryRequest updateCategoryRequest) {
        Category category = this.modelMapperService.forRequest().map(updateCategoryRequest,Category.class);
        this.categoryRepository.save(category);

    }
    @Override
    public void delete(Long categoryId) {
        this.categoryRepository.deleteById(categoryId);
    }


    public List<GetAllCategoryResponse> getAll() {
        List<Category> categories =categoryRepository.findAll();
        List<GetAllCategoryResponse> getAllCategoryResponses = new ArrayList<GetAllCategoryResponse>();
        List<GetAllCategoryResponse> categoryResponses = (List<GetAllCategoryResponse>) categories.stream()
                .map(category -> this.modelMapperService.forResponse().map(category,GetAllCategoryResponse.class))
                .collect(Collectors.toList());
        return categoryResponses;
    }

    @Override
    public List<GetByIdCategoryResponse> getById(Long categoryId) {
        Category category= this.categoryRepository.findById(categoryId).orElseThrow();
        GetByIdCategoryResponse response=
                this.modelMapperService.forResponse().map(category,GetByIdCategoryResponse.class);
        return (List<GetByIdCategoryResponse>) response;
    }


}
