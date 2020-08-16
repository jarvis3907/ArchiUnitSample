package org.example.onionarchitecture.adapter.persistence;


import org.example.onionarchitecture.domain.model.Product;

// Violates the architecture because Domain must be the owner of the interfaces, not the persistence adapter
public interface ProductRepository {
    Product read(ProductId id);

    long getTotalCount();
}
