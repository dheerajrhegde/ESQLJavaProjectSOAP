package com.github.dheerajhegde.esql.controller;

import com.github.dheerajhegde.esql.dto.OrderRequest;
import com.github.dheerajhegde.esql.dto.OrderResponse;
import com.github.dheerajhegde.esql.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService orderService;

    @Test
    public void testProcessOrder() throws Exception {
        OrderRequest request = new OrderRequest();
        request.setPartNo("12345");
        request.setPartQuantity(10);

        OrderResponse response = new OrderResponse();
        response.setOrderStatus("AVAILABLE");
        response.setOrderAmt(50);
        response.setPartNo("12345");
        response.setPartQuantity(10);

        when(orderService.processOrder(request)).thenReturn(response);

        mockMvc.perform(post("/acmeOrders/WADDR/ProcessOrders")
                .contentType("application/json")
                .content("{\"partNo\":\"12345\",\"partQuantity\":10}"))
                .andExpect(status().isOk());
    }
}
