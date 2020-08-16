package org.example.onionarchitecture.domain.service;


import org.example.onionarchitecture.adapter.persistence.ProductId;
import org.example.onionarchitecture.adapter.persistence.ProductRepository;
import org.example.onionarchitecture.adapter.persistence.ShoppingCartId;
import org.example.onionarchitecture.adapter.persistence.ShoppingCartRepository;
import org.example.onionarchitecture.domain.model.OrderItem;
import org.example.onionarchitecture.domain.model.Product;
import org.example.onionarchitecture.domain.model.ShoppingCart;

public class ShoppingService {
    private final ShoppingCartRepository shoppingCartRepository;
    private final ProductRepository productRepository;

    public ShoppingService(ShoppingCartRepository shoppingCartRepository, ProductRepository productRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
        this.productRepository = productRepository;
    }

    public void addToShoppingCart(ShoppingCartId shoppingCartId, ProductId productId, OrderQuantity quantity) {
        ShoppingCart shoppingCart = shoppingCartRepository.read(shoppingCartId);
        Product product = productRepository.read(productId);
        OrderItem newItem = new OrderItem(product, quantity);
        shoppingCart.add(newItem);
        shoppingCartRepository.save(shoppingCart);
    }
}
