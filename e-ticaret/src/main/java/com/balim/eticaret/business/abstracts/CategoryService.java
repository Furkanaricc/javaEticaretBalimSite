package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.request.UpdateCategoryRequest;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.*;

public interface CategoryService {
    void add (CreateCategoryRequest createCategoryRequest);
    void upDate(UpdateCategoryRequest createCategoryRequest);
    void delete(Long categoryId);

     List<GetAllCategoryResponse> getAll() ;

    List<GetByIdCategoryResponse>getById(Long categoryId);

}
