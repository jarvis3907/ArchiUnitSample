package org.example.layers.persistence.first.dao.jpa;

import org.example.layers.persistence.first.dao.SomeDao;
import org.example.layers.persistence.first.dao.domain.PersistentObject;
import org.example.layers.security.Secured;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



public class SomeJpa implements SomeDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Secured
    public SomeJpa() {
    }

    @Override
    public PersistentObject findById(long id) {
        return entityManager.find(PersistentObject.class, id);
    }
}
