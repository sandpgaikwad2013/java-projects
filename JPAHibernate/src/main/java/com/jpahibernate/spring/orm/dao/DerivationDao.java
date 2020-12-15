package com.jpahibernate.spring.orm.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.thegoldensource.data.persistence.mds.GoldenPriceConsolidatedStatus;
import com.thegoldensource.data.persistence.mds.Issue;
import com.thegoldensource.data.persistence.mds.IssueCalculatedValue;
import com.thegoldensource.data.persistence.mds.IssueCurveSurCharacteristics;
import com.thegoldensource.data.persistence.mds.IssuePrice;
import com.thegoldensource.data.persistence.mds.IssueType;
import com.thegoldensource.data.persistence.mds.MatrixDefinition;
import com.thegoldensource.data.persistence.mds.MatrixDefinitionInstance;
import com.thegoldensource.data.persistence.mds.MatrixGridDetails;
import com.thegoldensource.data.persistence.mds.PriceValidationDerivationLog;

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
        createQuery.setParameter("abc", "C&w-p<4cO1");// tenor4lS24
        List<MatrixDefinitionInstance> rs = createQuery.getResultList();
        MatrixDefinitionInstance issue = rs.get(0);
        Set<IssueCalculatedValue> rs1 = issue.getIssueCalculatedValues();
        System.out.println(rs1);

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
