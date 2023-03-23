package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.ProductService;
import com.balim.eticaret.business.request.CreateProductRequest;
import com.balim.eticaret.business.request.UpdateProductRequest;
import com.balim.eticaret.business.response.GetAllProductResponse;
import com.balim.eticaret.business.response.GetByIdProductResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    @Override
    public void add(CreateProductRequest createProductRequest) {

    }

    @Override
    public void upDate(UpdateProductRequest updateProductResponse) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<GetAllProductResponse> getAll() {
        return null;
    }

    @Override
    public List<GetByIdProductResponse> getById(int id) {
        return null;
    }
}
