package org.example.layers.service;

import org.example.layers.MyService;
import org.example.layers.persistence.first.dao.SomeDao;
import org.example.layers.persistence.second.dao.OtherDao;
import org.example.layers.persistence.second.dao.domain.OtherPersistentObject;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@MyService
public class ServiceViolatingDaoRules {
    @EJB
    private SomeDao someDao;
    @EJB
    private OtherDao otherDao;
    @PersistenceContext
    private MyEntityManager myEntityManager;

    public void doSthService() {
        someDao.findById(0);
    }

    public void illegallyUseEntityManager() {
        otherDao.getEntityManager().persist(new OtherPersistentObject(1L)); // Violates rule not to use EntityManager outside of DAOs
        myEntityManager.persist(new OtherPersistentObject(2L)); // Violates rule not to use EntityManager outside of DAOs
    }

    public abstract static class MyEntityManager implements EntityManager {
    }
}
