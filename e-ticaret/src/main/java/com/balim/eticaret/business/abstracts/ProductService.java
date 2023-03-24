package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateProductRequest;
import com.balim.eticaret.business.request.UpdateProductRequest;
import com.balim.eticaret.business.response.GetAllProductResponse;
import com.balim.eticaret.business.response.GetByIdProductResponse;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface ProductService {

    void add(CreateProductRequest createProductRequest);
    void upDate(UpdateProductRequest updateProductResponse);
    void delete (int id);

    static List<GetAllProductResponse> getAll() {
        return null;
    }


    List<GetByIdProductResponse>getById(int id);

}
