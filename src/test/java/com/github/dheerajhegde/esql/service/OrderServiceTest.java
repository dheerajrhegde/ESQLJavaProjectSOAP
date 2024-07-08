package com.github.dheerajhegde.esql.service;

import com.github.dheerajhegde.esql.dto.OrderRequest;
import com.github.dheerajhegde.esql.dto.OrderResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void testProcessOrder() {
        OrderService orderService = new OrderService();

        OrderRequest request = new OrderRequest();
        request.setPartNo("12345");
        request.setPartQuantity(10);

        OrderResponse response = orderService.processOrder(request);

        assertEquals("AVAILABLE", response.getOrderStatus());
        assertEquals(50, response.getOrderAmt());
        assertEquals("12345", response.getPartNo());
        assertEquals(10, response.getPartQuantity());
    }
}
