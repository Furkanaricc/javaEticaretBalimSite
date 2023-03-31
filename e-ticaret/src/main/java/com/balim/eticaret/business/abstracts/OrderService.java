package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.request.UpdateOrderRequest;
import com.balim.eticaret.business.response.GetAllOrderResponse;

import com.balim.eticaret.business.response.GetByIdOrderResponse;

import java.util.List;

public interface OrderService {
    void add (CreateOrderRequest createOrderRequest);
    void upDate(UpdateOrderRequest createOrderRequest);
    void delete(int orderNumber);
    List<GetAllOrderResponse> getAll();
    List<GetByIdOrderResponse>getById(int orderNumber, int piece, int shippingCost);
}
