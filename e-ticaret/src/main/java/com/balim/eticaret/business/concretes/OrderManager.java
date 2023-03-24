package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.OrderService;
import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.request.UpdateOrderRequest;
import com.balim.eticaret.business.response.GetAllOrderResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderManager implements OrderService {
    @Override
    public void add(CreateOrderRequest createOrderRequest) {

    }

    @Override
    public void upDate(UpdateOrderRequest createOrderRequest) {

    }

    @Override
    public void delete(int orderNumber) {

    }

    @Override
    public List<GetAllOrderResponse> getAll() {
        return null;
    }

    @Override
    public List<GetByIdCategoryResponse> getById(int orderNumber, int piece, int shippingCost) {
        return null;
    }
}
