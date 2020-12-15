package com.jpahibernate.spring.orm.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jpahibernate.spring.orm.dao.DerivationDao;
import com.thegoldensource.data.persistence.mds.GoldenPriceConsolidatedStatus;
import com.thegoldensource.data.persistence.mds.Issue;
import com.thegoldensource.data.persistence.mds.IssuePrice;
import com.thegoldensource.data.persistence.mds.IssueType;
import com.thegoldensource.data.persistence.mds.MatrixDefinition;
import com.thegoldensource.data.persistence.mds.MatrixDefinitionInstance;

@Component
public class DerivationService
{
    @Autowired
    private DerivationDao derivationDao;

    @Transactional(readOnly = true)
    public List<GoldenPriceConsolidatedStatus> listAll()
    {
        return derivationDao.findAll();

    }

    @Transactional(readOnly = true)
    public List<Issue> listAllIssue()
    {
        return derivationDao.findAllIssue();

    }

    public List<MatrixDefinition> getMatrixDefinition()
    {
        return derivationDao.getMatrixDefinition();
    }

    @Transactional
    public List<MatrixDefinitionInstance> getMatrixDefinitionInstance()
    {
        return derivationDao.getMatrixDefinitionInstance();
    }

    public List<IssueType> getIssueType()
    {
        return derivationDao.getIssueType();
    }

    public List<IssuePrice> getIssuePrice()
    {
        return derivationDao.getIssuePrice();
    }

    public List<GoldenPriceConsolidatedStatus> GoldenPriceConsolidatedStatus()
    {
        return derivationDao.GoldenPriceConsolidatedStatus();
    }

    @Transactional(readOnly = true)
    public List<Issue> getIssue()
    {
        return derivationDao.getIssue();
    }

}
