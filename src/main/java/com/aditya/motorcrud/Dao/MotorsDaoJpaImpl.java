package com.aditya.motorcrud.Dao;

import com.aditya.motorcrud.Entity.Motors;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorsDaoJpaImpl implements MotorDao{

    //define EntityManager Field
    private EntityManager entityManager;

    //set up Conjunction injection
    @Autowired
    public MotorsDaoJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Motors> findAll() {
        //create a query
        TypedQuery<Motors> theQuery = entityManager.createQuery("from Motors",Motors.class);

        //execute query and get result list
        List<Motors> Motors = theQuery.getResultList();

        //return result
        return Motors;
    }

    @Override
    public Motors findById(int theId) {
        Motors theMotors = entityManager.find(Motors.class,theId);
        return theMotors;
    }

    @Override
    public Motors save(Motors theMotors) {
        Motors dbMotors = entityManager.merge(theMotors);

        return dbMotors;
    }

    @Override
    public Void deleteById(int theId) {
        Motors theMotors = entityManager.find(Motors.class, theId);

        entityManager.remove(theMotors);
        return null;
    }
}
