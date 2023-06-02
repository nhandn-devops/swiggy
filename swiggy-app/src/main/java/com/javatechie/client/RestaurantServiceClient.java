package com.javatechie.client;

import com.javatechie.dto.OrderResponseDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestaurantServiceClient {
    @Autowired
    private RestTemplate template;

    @Value("${swiggy.url}")
    private String url;

    public OrderResponseDTO fetchOrderStatus(String orderId) {
        return template.getForObject(String.format("%s/restaurant/orders/status/", url) + orderId, OrderResponseDTO.class);
    }
}
