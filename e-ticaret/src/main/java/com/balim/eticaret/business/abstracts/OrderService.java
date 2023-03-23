package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.response.GetAllCategoryResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;

import java.util.List;

public interface OrderService {
    void add (CreateOrderRequest createOrderRequest);
    void upDate(CreateOrderRequest createOrderRequest);
    void delete(int orderNumber);
    List<GetAllCategoryResponse> getAll();
    List<GetByIdCategoryResponse>getById(int orderNumber,int piece,int shippingCost);
}
