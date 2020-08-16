package org.example.layers.persistence.second.dao;

import org.example.layers.persistence.second.dao.domain.OtherPersistentObject;

import java.sql.SQLException;

import javax.persistence.EntityManager;


public interface OtherDao {
    OtherPersistentObject findById(long id);

    void testConnection() throws SQLException;

    EntityManager getEntityManager();
}
