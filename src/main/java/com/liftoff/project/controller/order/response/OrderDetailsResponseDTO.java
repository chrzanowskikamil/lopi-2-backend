package com.liftoff.project.controller.order.response;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class OrderDetailsResponseDTO {

//    private UUID uId;
//    private Instant orderDate;
//    private OrderStatus status;
//    private Double totalPrice;
//    private DeliveryMethodResponseDTO deliveryMethod;
//    private AddressResponseDTO shippingAddress;
//    private AddressResponseDTO billingAddress;
//    private PaymentMethodResponseDTO paymentMethod;
//    private CartResponseDTO cart;
//    private CustomerResponseDTO customer;
//    private Instant createdAt;
//    private Instant updatedAt;
//    private boolean termsAccepted;

    private UUID orderUid;
    private String deliveryMethod;
    private String customerEmail;
    private AddressResponseDTO deliveryAddress;
    private String paymentMethod;
    private Instant orderDate;
    private String customerPhone;


}
