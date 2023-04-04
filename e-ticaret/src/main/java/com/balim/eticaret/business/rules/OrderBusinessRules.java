package com.balim.eticaret.business.rules;

import com.balim.eticaret.core.utilities.exceptions.BusinessException;
import com.balim.eticaret.dataAccess.abstracts.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderBusinessRules {
    private OrderRepository ordersRepository;
    public void checkIfOrderExists(Integer id){
        if(this.ordersRepository.existsByOrderId(id)){
            throw new BusinessException("Order id aynı olamaz");
        }

    }
}
