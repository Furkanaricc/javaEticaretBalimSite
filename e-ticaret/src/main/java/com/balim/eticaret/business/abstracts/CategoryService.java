package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import com.balim.eticaret.entitiy.Category;
import java.util.*;

public interface CategoryService {
    void add (CreateCategoryRequest createCategoryRequest);
    void upDate(CreateCategoryRequest createCategoryRequest);
    void delete(int id);
    List<GetAllCategoryResponse>getAll();
    List<GetByIdCategoryResponse>getById(int id,String categoryName);
}
