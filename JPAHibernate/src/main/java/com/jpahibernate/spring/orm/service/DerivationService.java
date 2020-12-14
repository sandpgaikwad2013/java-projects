package com.jpahibernate.spring.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jpahibernate.spring.orm.dao.DerivationDao;
import com.jpahibernate.spring.orm.model.GoldenPriceConsolidatedStatus;
import com.jpahibernate.spring.orm.model.Issue;
import com.jpahibernate.spring.orm.model.IssueType;
import com.jpahibernate.spring.orm.model.MatrixDefinition;
import com.jpahibernate.spring.orm.model.MatrixDefinitionInstance;

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

    public List<MatrixDefinitionInstance> getMatrixDefinitionInstance()
    {
        return derivationDao.getMatrixDefinitionInstance();
    }

    public List<IssueType> getIssueType()
    {
        return derivationDao.getIssueType();
    }

}
