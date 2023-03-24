package com.balim.eticaret.webController;

import com.balim.eticaret.business.abstracts.ProductService;
import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.request.CreateProductRequest;
import com.balim.eticaret.business.request.UpdateCategoryRequest;
import com.balim.eticaret.business.request.UpdateProductRequest;
import com.balim.eticaret.business.response.GetAllProductResponse;
import com.balim.eticaret.business.response.GetByIdProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
public class ProductController {
    private ProductService productService;
    private HttpStatus code;

    public ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping
    List<GetAllProductResponse>getAll(){
        return ProductService.getAll();
    }
    @GetMapping({"{/id}"})
    GetByIdProductResponse getById(@PathVariable int id){
        return (GetByIdProductResponse) productService.getById(id);
    }
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() @Valid()CreateProductRequest createProductRequest){
        this.productService.add(createProductRequest);
    }
    @PutMapping()
    public void update(@RequestBody()UpdateProductRequest updateProductRequest){
        this.productService.upDate(updateProductRequest);
    }
    @DeleteMapping("/id)")
    public void delete(@PathVariable int id){

        this.productService.delete(id);
    }

}
