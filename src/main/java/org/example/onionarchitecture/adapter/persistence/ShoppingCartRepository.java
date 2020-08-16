package org.example.onionarchitecture.adapter.persistence;


import org.example.onionarchitecture.domain.model.ShoppingCart;

// Violates the architecture because Domain must be the owner of the interfaces, not the persistence adapter
public interface ShoppingCartRepository {
    ShoppingCart read(ShoppingCartId id);

    void save(ShoppingCart shoppingCart);
}
