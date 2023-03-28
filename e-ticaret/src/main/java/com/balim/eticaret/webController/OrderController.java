package com.balim.eticaret.webController;

import com.balim.eticaret.business.abstracts.OrderService;
import com.balim.eticaret.business.request.CreateOrderRequest;
import com.balim.eticaret.business.request.CreateProductRequest;
import com.balim.eticaret.business.request.UpdateOrderRequest;
import com.balim.eticaret.business.request.UpdateUserRequest;
import com.balim.eticaret.business.response.GetAllOrderResponse;
import com.balim.eticaret.business.response.GetByIdOrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    private HttpStatus code;

    private OrderController (OrderService orderService){
        this.orderService=orderService;
    }
    @GetMapping
    List<GetAllOrderResponse>getAll(){
        return orderService.getAll();
    }
    @GetMapping("/{orderName-piece-shippingCost}")
    GetByIdOrderResponse getById(@PathVariable int orderNumber,int piece,int shippingCost){
        return(GetByIdOrderResponse) orderService.getById(orderNumber,piece,shippingCost);

    }
    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody() @Valid()CreateOrderRequest createOrderRequest){
        this.orderService.add(createOrderRequest);
    }
    @PutMapping
    public void upDate(@RequestBody() UpdateOrderRequest updateOrderRequest){
        this.orderService.upDate(updateOrderRequest);
    }
    @DeleteMapping
    public void delete(@PathVariable int orderNumber){
        this.orderService.delete(orderNumber);
    }

}
