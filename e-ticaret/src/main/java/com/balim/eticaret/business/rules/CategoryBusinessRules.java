package com.balim.eticaret.business.rules;

import com.balim.eticaret.core.utilities.exceptions.BusinessException;
import com.balim.eticaret.dataAccess.abstracts.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryBusinessRules {
    private CategoryRepository categoryRepository;
    public void checkIfCategoryExists(String categoryName){
        if(this.categoryRepository.existsByCategotyName(categoryName)){
            throw new BusinessException("Aynı isimde kategori oluşturulamaz.");
        }
    }
}
