package com.jpahibernate.spring.orm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jpahibernate.spring.orm.model.GoldenPrice;
import com.jpahibernate.spring.orm.model.Issue;

@Component
public class DerivationDao
{

    @PersistenceContext(unitName = "MDSPersistenceUnit")
    private EntityManager em;

    public List<GoldenPrice> findAll()
    {
        String hql = "SELECT p FROM GoldenPrice p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "Vr5O05SdO1");
        return createQuery.getResultList();
    }

    public List<Issue> findAllIssue()
    {
        String hql = "SELECT p FROM Issue p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "CBAGRCC3  ");
        return createQuery.getResultList();
    }

}
