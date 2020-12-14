package com.jpahibernate.spring.orm.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.jpahibernate.spring.orm.model.GoldenPrice;
import com.jpahibernate.spring.orm.model.Issue;
import com.jpahibernate.spring.orm.service.DerivationService;

public class SpringOrmMain
{

    public static void main(String[] args)
    {

        // Create Spring application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");

        // Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
        DerivationService productService = ctx.getBean(DerivationService.class);

        // Do some data operation

        // productService.add(new Product(1, "Bulb"));
        // productService.add(new Product(2, "Dijone mustard"));

//        List<GoldenPrice> extracted = extracted(productService);
//        System.out.println("listAll: " + extracted);

        List<Issue> listAllIssue = productService.listAllIssue();
        System.out.println("listAll Issue: " + listAllIssue.get(0).getGoldenPrices().size());

        // Test transaction rollback (duplicated key)

        try
        {
            // productService.addAll(Arrays.asList(new Product(3, "Book"), new Product(4, "Soap"), new Product(1,
            // "Computer")));
        }
        catch (DataAccessException dataAccessException)
        {
        }

        // Test element list after rollback
        System.out.println("listAll: " + productService);

        ctx.close();

    }

    private static List<GoldenPrice> extracted(DerivationService productService)
    {
        return productService.listAll();
    }
}
