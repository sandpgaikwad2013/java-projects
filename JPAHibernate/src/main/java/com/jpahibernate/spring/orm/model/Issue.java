package com.jpahibernate.spring.orm.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_ISSU")
public class Issue
{
    @Id
    @Column(name = "INSTR_ID")
    String id;

    @OneToMany(mappedBy = "issue", fetch = FetchType.EAGER)
    Set<GoldenPrice> goldenPrices;

    public Set<GoldenPrice> getGoldenPrices()
    {
        return goldenPrices;
    }

    public void setGoldenPrices(Set<GoldenPrice> goldenPrices)
    {
        this.goldenPrices = goldenPrices;
    }
}
