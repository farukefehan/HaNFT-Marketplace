package com.hanftmarketplace.marketplace.dto;

import com.hanftmarketplace.marketplace.entity.Address;
import com.hanftmarketplace.marketplace.entity.Customer;
import com.hanftmarketplace.marketplace.entity.Order;
import com.hanftmarketplace.marketplace.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
