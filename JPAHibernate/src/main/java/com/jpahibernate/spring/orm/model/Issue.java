package com.jpahibernate.spring.orm.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_ISSU")
public class Issue implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "INSTR_ID")
    private String id;

    @OneToMany(mappedBy = "issue", fetch = FetchType.EAGER)
    private Set<GoldenPriceConsolidatedStatus> goldenPriceConsolidatedStatus;

    @ManyToOne
    @JoinColumn(name = "ISS_TYP")
    IssueType issueType;

    public Set<GoldenPriceConsolidatedStatus> getGoldenPriceConsolidatedStatus()
    {
        return goldenPriceConsolidatedStatus;
    }

    public void setGoldenPriceConsolidatedStatus(Set<GoldenPriceConsolidatedStatus> goldenPriceConsolidatedStatus)
    {
        this.goldenPriceConsolidatedStatus = goldenPriceConsolidatedStatus;
    }

}
