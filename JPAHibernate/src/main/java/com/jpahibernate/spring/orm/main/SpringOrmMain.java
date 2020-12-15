package com.jpahibernate.spring.orm.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpahibernate.spring.orm.model.Issue;
import com.jpahibernate.spring.orm.service.DerivationService;

public class SpringOrmMain
{

    public static void main(String[] args)
    {

        // Create Spring application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

        DerivationService derivationService = ctx.getBean(DerivationService.class);

        derivationService.getIssue();

        ctx.close();

    }

}
