package com.github.dheerajhegde.esql.controller;

import com.github.dheerajhegde.esql.dto.OrderRequest;
import com.github.dheerajhegde.esql.dto.OrderResponse;
import com.github.dheerajhegde.esql.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acmeOrders/WADDR")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/ProcessOrders")
    public OrderResponse processOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.processOrder(orderRequest);
    }
}
