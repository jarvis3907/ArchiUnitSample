package org.example.layers.persistence.first.dao;


import org.example.layers.persistence.first.dao.domain.PersistentObject;

public interface SomeDao {
    PersistentObject findById(long id);
}
