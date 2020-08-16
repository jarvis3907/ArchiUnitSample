package org.example.onionarchitecture.adapter.rest;

import org.example.onionarchitecture.adapter.persistence.ProductId;
import org.example.onionarchitecture.adapter.persistence.ShoppingCartId;
import org.example.onionarchitecture.domain.service.OrderQuantity;
import org.example.onionarchitecture.domain.service.ShoppingService;

import java.util.UUID;

@SuppressWarnings("unused")
public class ShoppingController {
    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    // @POST or similar
    public void addToShoppingCart(UUID shoppingCartId, UUID productId, int quantity) {
        shoppingService.addToShoppingCart(new ShoppingCartId(shoppingCartId), new ProductId(productId), new OrderQuantity(quantity));
    }
}
