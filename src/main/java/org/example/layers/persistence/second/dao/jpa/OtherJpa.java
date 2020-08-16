package org.example.layers.persistence.second.dao.jpa;

import org.example.layers.persistence.second.dao.OtherDao;
import org.example.layers.persistence.second.dao.domain.OtherPersistentObject;
import org.example.layers.security.Secured;

import java.sql.Connection;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class OtherJpa implements OtherDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public OtherPersistentObject findById(long id) {

        return entityManager.find(OtherPersistentObject.class, id);
    }

    @Override
    public void testConnection() throws SQLException {
        Connection conn = entityManager.unwrap(Connection.class);
        conn.prepareStatement("SELECT 1 FROM DUAL");
    }

    @Override
    @Secured
    public EntityManager getEntityManager() {
        return entityManager;
    }
}
