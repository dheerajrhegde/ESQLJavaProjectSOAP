package com.github.dheerajhegde.esql.service;

import com.github.dheerajhegde.esql.dto.OrderRequest;
import com.github.dheerajhegde.esql.dto.OrderResponse;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderResponse processOrder(OrderRequest orderRequest) {
        OrderResponse response = new OrderResponse();
        response.setOrderStatus("AVAILABLE");
        response.setOrderAmt(50);
        response.setPartNo(orderRequest.getPartNo());
        response.setPartQuantity(orderRequest.getPartQuantity());
        return response;
    }
}
