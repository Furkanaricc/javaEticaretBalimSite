package com.balim.eticaret.business.rules;


import com.balim.eticaret.core.utilities.exceptions.BusinessException;
import com.balim.eticaret.dataAccess.abstracts.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductBusinessRules {
     private ProductsRepository productsRepository;
     public void checkIfProductExists(String name){
          if(this.productsRepository.existsByName(name)){
               throw new BusinessException("Product name already exists.");
          }

     }

}
