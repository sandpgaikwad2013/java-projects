package com.jpahibernate.spring.orm.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpahibernate.spring.orm.model.IssueType;
import com.jpahibernate.spring.orm.service.DerivationService;

public class SpringOrmMain
{

    public static void main(String[] args)
    {

        // Create Spring application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

        DerivationService derivationService = ctx.getBean(DerivationService.class);

        List<IssueType> matrixDefinitionInstance = derivationService.getIssueType();
        System.out.println("listAll : " + matrixDefinitionInstance);
        // System.out.println("listAll : " + matrixDefinitionInstance.get(0).getMatrixGridDetails());

        ctx.close();

    }

}
