package com.balim.eticaret.business.abstracts;

import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.request.UpdateOrderRequest;
import com.balim.eticaret.business.response.GetAllOrderResponse;
import com.balim.eticaret.business.response.GetByIdCategoryResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {
    void add (CreateOrderRequest createOrderRequest);
    void upDate(UpdateOrderRequest createOrderRequest);
    void delete(int orderNumber);
    List<GetAllOrderResponse> getAll();
    List<GetByIdCategoryResponse>getById(int orderNumber,int piece,int shippingCost);
}
