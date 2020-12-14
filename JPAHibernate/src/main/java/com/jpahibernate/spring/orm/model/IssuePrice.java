package com.jpahibernate.spring.orm.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_ISPC")
public class IssuePrice implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ISS_PRC_ID")
    String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @OneToOne(mappedBy = "issuePrice", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    GoldenPrice goldenPrice;

    public GoldenPrice getGoldenPrice()
    {
        return goldenPrice;
    }

    public void setGoldenPrice(GoldenPrice goldenPrice)
    {
        this.goldenPrice = goldenPrice;
    }

}
