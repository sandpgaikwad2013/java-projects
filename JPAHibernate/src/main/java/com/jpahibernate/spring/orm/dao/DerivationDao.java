package com.jpahibernate.spring.orm.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jpahibernate.spring.orm.model.GoldenPriceConsolidatedStatus;
import com.jpahibernate.spring.orm.model.Issue;
import com.jpahibernate.spring.orm.model.IssueCalculatedValue;
import com.jpahibernate.spring.orm.model.IssueCurveSurCharacteristics;
import com.jpahibernate.spring.orm.model.IssuePrice;
import com.jpahibernate.spring.orm.model.IssueType;
import com.jpahibernate.spring.orm.model.MatrixDefinition;
import com.jpahibernate.spring.orm.model.MatrixDefinitionInstance;
import com.jpahibernate.spring.orm.model.MatrixGridDetails;
import com.jpahibernate.spring.orm.model.PriceValidationDerivationLog;

@Component
public class DerivationDao
{

    @PersistenceContext(unitName = "MDSPersistenceUnit")
    private EntityManager em;

    public List<GoldenPriceConsolidatedStatus> findAll()
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

    public List<MatrixDefinition> getMatrixDefinition()
    {
        String hql = "SELECT p FROM MatrixDefinition p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "q2AhF35XW1");
        return createQuery.getResultList();
    }

    public List<MatrixDefinitionInstance> getMatrixDefinitionInstance()
    {
        String hql = "SELECT p FROM MatrixDefinitionInstance p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "AQ5e1AUTO1");// tenor4lS24
        List<MatrixDefinitionInstance> rs = createQuery.getResultList();
        MatrixDefinitionInstance issue = rs.get(0);
        Set<IssueCurveSurCharacteristics> rs1 = issue.getIssueCurveSurCharacteristics();
        System.out.println(rs1);
        Set<MatrixGridDetails> ob1 = issue.getMatrixGridDetails();
        System.out.println(ob1);

        return rs;
    }

    public List<IssueType> getIssueType()
    {
        String hql = "SELECT p FROM IssueType p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "FXSPOT");
        return createQuery.getResultList();
    }

    public List<IssuePrice> getIssuePrice()
    {
        String hql = "SELECT p FROM IssuePrice p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "PCMD2R5690");
        return createQuery.getResultList();
    }

    public List<GoldenPriceConsolidatedStatus> GoldenPriceConsolidatedStatus()
    {
        String hql = "SELECT p FROM GoldenPriceConsolidatedStatus p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "Vr5O05SdO1");
        return createQuery.getResultList();
    }

    public List<Issue> getIssue()
    {
        String hql = "SELECT p FROM Issue p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "Lagerpol20");// tenor4lS24
        List<Issue> rs = createQuery.getResultList();
        Issue issue = rs.get(0);
        Set<PriceValidationDerivationLog> rs1 = issue.getPriceValidationDerivationLogs();
        System.out.println(rs1);
        return rs;
    }

}
