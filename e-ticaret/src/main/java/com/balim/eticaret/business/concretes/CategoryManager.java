package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.CategoryService;
import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.request.UpdateCategoryRequest;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;

import java.util.List;

public class CategoryManager implements CategoryService {
    @Override
    public void add(CreateCategoryRequest createCategoryRequest) {

    }

    @Override
    public void upDate(UpdateCategoryRequest createCategoryRequest) {

    }

    @Override
    public void delete(int categoryId, String categoryName) {

    }

    @Override
    public List<GetByIdCategoryResponse> getById(int id, String categoryName) {
        return null;
    }
}
