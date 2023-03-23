package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.CategoryService;
import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryManager implements CategoryService {
    @Override
    public void add(CreateCategoryRequest createCategoryRequest) {

    }

    @Override
    public void upDate(CreateCategoryRequest createCategoryRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<GetAllCategoryResponse> getAll() {
        return null;
    }

    @Override
    public List<GetByIdCategoryResponse> getById(int id, String categoryName) {
        return null;
    }

}
