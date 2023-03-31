package com.balim.eticaret.business.concretes;

import com.balim.eticaret.business.abstracts.OrderService;
import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.request.UpdateOrderRequest;
import com.balim.eticaret.business.response.GetAllOrderResponse;
import com.balim.eticaret.business.response.GetByIdOrderResponse;
import com.balim.eticaret.core.utilities.mappers.ModelMapperService;
import com.balim.eticaret.dataAccess.abstracts.OrderRepository;
import com.balim.eticaret.entitiy.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderManager implements OrderService {

    private OrderRepository orderRepository;
    private ModelMapperService modelMapperService;

    @Override
    public void add(CreateOrderRequest createOrderRequest) {
    Order order = this.modelMapperService.forRequest().map(createOrderRequest,Order.class);
    this.orderRepository.save(order);
    }

    @Override
    public void upDate(UpdateOrderRequest updateOrderRequest) {
        Order order = this.modelMapperService.forRequest().map(updateOrderRequest,Order.class);
        this.orderRepository.save(order);
    }

    @Override
    public void delete(int orderNumber) {
        this.orderRepository.deleteById(orderNumber);

    }

    @Override
    public List<GetAllOrderResponse> getAll() {
        List<Order> orders = orderRepository.findAll();
        List<GetAllOrderResponse> getAllOrderResponses = new ArrayList<GetAllOrderResponse>();
        List<GetAllOrderResponse> orderResponses =(List<GetAllOrderResponse>)orders.stream()
                .map(product -> this.modelMapperService.forResponse().map(orders,GetAllOrderResponse.class))
                .collect(Collectors.toList());

        return orderResponses;
    }

    @Override
    public List<GetByIdOrderResponse> getById(int orderNumber, int piece, int shippingCost) {
        Order order = this.orderRepository.findById(orderNumber).orElseThrow();
        GetByIdOrderResponse response =
                this.modelMapperService.forResponse().map(order,GetByIdOrderResponse.class);

        return(List<GetByIdOrderResponse>)response;
    }
}
