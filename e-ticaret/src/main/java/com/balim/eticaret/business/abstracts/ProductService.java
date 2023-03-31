package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateProductRequest;
import com.balim.eticaret.business.request.UpdateProductRequest;
import com.balim.eticaret.business.response.GetAllProductResponse;
import com.balim.eticaret.business.response.GetByIdProductResponse;
import org.springframework.stereotype.Service;

import java.util.*;

public interface ProductService {

    void add(CreateProductRequest createProductRequest);
    void upDate(UpdateProductRequest updateProductRequest);
    void delete (int id);

   List<GetAllProductResponse> getAll();

    List<GetByIdProductResponse>getById(int id);

}
