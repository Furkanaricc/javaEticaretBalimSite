package com.balim.eticaret.webController;

import com.balim.eticaret.business.abstracts.AdminService;
import com.balim.eticaret.business.abstracts.CategoryService;
import com.balim.eticaret.business.request.CreateCategoryRequest;
import com.balim.eticaret.business.request.UpdateCategoryRequest;
import com.balim.eticaret.business.response.GetAllAdminResponse;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
    private HttpStatus code;
//    @Autowired
    public CategoryController ( CategoryService categoryService) {
        this.categoryService=categoryService;
    }
    @GetMapping()
    List<GetAllCategoryResponse>getAll(){
        return categoryService.getAll();
    }
    @GetMapping("/{categoryId}")
    public GetByIdCategoryResponse getById(@PathVariable Long categoryId){
        return (GetByIdCategoryResponse) categoryService.getById(categoryId);
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() @Valid() CreateCategoryRequest createCategoryRequest){
        this.categoryService.add(createCategoryRequest);
    }
    @PutMapping()
    public void update(@RequestBody()UpdateCategoryRequest updateCategoryRequest){
        this.categoryService.upDate(updateCategoryRequest);
    }
    @DeleteMapping("/categoryId-name)")
    public void delete(@PathVariable Long categoryId,String categoryName){

        this.categoryService.delete(categoryId);
    }

}
