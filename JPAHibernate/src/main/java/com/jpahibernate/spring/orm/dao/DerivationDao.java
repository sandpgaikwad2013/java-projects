package com.jpahibernate.spring.orm.dao;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Filter;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.thegoldensource.data.persistence.mds.GoldenPriceConsolidatedStatus;
import com.thegoldensource.data.persistence.mds.Issue;
import com.thegoldensource.data.persistence.mds.IssueCalculatedValue;
import com.thegoldensource.data.persistence.mds.IssuePrice;
import com.thegoldensource.data.persistence.mds.IssueType;
import com.thegoldensource.data.persistence.mds.MatrixDefinition;
import com.thegoldensource.data.persistence.mds.MatrixDefinitionInstance;

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
        Date date = new GregorianCalendar(2019, Calendar.APRIL, 01).getTime();
        date = getStartOfDay(date);

        String hql = "SELECT p FROM Issue p WHERE P.id=:abc ";
        Query createQuery = em.createQuery(hql);
        createQuery.setParameter("abc", "CBAGRAA4  ");
        List<Issue> rs = createQuery.getResultList();
        Issue issue = rs.get(0);
        Session session = em.unwrap(Session.class);
        Filter filter = session.enableFilter("gpcsFilter");
        filter.setParameter("ppedId", "CBAGR11111");
        filter.setParameter("downstreamId", "CBAGR_DWDF");
        filter.setParameter("quoteType", "PRCQUOTE");
        filter.setParameter("ccy", "EUR");
        filter.setParameter("method", "VENDOR");
        filter.setParameter("priceType", "ASKED ");

        filter.setParameter("addlQualType", "1");
        filter.setParameter("prcTms", date);

        Set<com.thegoldensource.data.persistence.mds.GoldenPriceConsolidatedStatus> rs1 = issue
                .getGoldenPriceConsolidatedStatus();
        System.out.println(rs1);

        Set<IssuePrice> prices = issue.getIssuePrice();
        System.out.println(prices);
        return rs;
    }

    public static Date getStartOfDay(Date date)
    {

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(date.getTime());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);

        calendar.set(year, month, day, 0, 0, 0);
        return calendar.getTime();

    }

}
