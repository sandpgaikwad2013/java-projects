package com.jpahibernate.spring.orm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jpahibernate.spring.orm.dao.DerivationDao;
import com.jpahibernate.spring.orm.model.GoldenPrice;
import com.jpahibernate.spring.orm.model.Issue;

@Component
public class DerivationService
{
    @Autowired
    private DerivationDao derivationDao;

    @Transactional(readOnly = true)
    public List<GoldenPrice> listAll()
    {
        return derivationDao.findAll();

    }

    @Transactional(readOnly = true)
    public List<Issue> listAllIssue()
    {
        return derivationDao.findAllIssue();

    }

}
