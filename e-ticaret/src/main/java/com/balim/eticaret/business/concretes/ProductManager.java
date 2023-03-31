package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.ProductService;
import com.balim.eticaret.business.request.CreateProductRequest;
import com.balim.eticaret.business.request.UpdateProductRequest;
import com.balim.eticaret.business.response.GetAllProductResponse;
import com.balim.eticaret.business.response.GetByIdProductResponse;
import com.balim.eticaret.core.utilities.mappers.ModelMapperService;
import com.balim.eticaret.dataAccess.abstracts.ProductsRepository;
import com.balim.eticaret.entitiy.Product;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductsRepository productsRepository;
    private ModelMapperService modelMapperService;


    @Override
    public void add(CreateProductRequest createProductRequest) {

        Product product = this.modelMapperService.forRequest().map(createProductRequest, Product.class);

        this.productsRepository.save(product);
    }


    @Override
    public List<GetAllProductResponse> getAll() {

        List<Product> products = productsRepository.findAll();
        List<GetAllProductResponse> getAllProductResponses = new ArrayList<GetAllProductResponse>();
        List<GetAllProductResponse> productResponse = (List<GetAllProductResponse>) products.stream().map(
                        product -> this.modelMapperService.forResponse().map(product, GetAllProductResponse.class))
                .collect(Collectors.toList());

        return productResponse;
    }

    @Override
    public List<GetByIdProductResponse> getById(int id) {
        Product product = this.productsRepository.findById(id).orElseThrow();
        GetByIdProductResponse response =
                this.modelMapperService.forResponse().map(product,GetByIdProductResponse.class);
        return (List<GetByIdProductResponse>) response;
    }

    @Override
    public void upDate(UpdateProductRequest updateProductRequest) {

        Product product = this.modelMapperService.forRequest().map(updateProductRequest,Product.class);
    this.productsRepository.save(product);
    }

    @Override
    public void delete(int id) {
        this.productsRepository.deleteById(id);

    }
}