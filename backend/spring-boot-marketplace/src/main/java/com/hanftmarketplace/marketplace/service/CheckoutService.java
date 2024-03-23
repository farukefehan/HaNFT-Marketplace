package com.hanftmarketplace.marketplace.service;

import com.hanftmarketplace.marketplace.dto.Purchase;
import com.hanftmarketplace.marketplace.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

}
