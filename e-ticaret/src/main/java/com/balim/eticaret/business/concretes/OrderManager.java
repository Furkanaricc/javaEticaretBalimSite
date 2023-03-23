package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.OrderService;
import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderManager implements OrderService {
    @Override
    public void add(CreateOrderRequest createOrderRequest) {

    }

    @Override
    public void upDate(CreateOrderRequest createOrderRequest) {

    }

    @Override
    public void delete(int orderNumber) {

    }

    @Override
    public List<GetAllCategoryResponse> getAll() {
        return null;
    }

    @Override
    public List<GetByIdCategoryResponse> getById(int orderNumber, int piece, int shippingCost) {
        return null;
    }
}
