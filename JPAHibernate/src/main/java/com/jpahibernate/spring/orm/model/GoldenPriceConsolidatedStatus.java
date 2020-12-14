package com.jpahibernate.spring.orm.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FT_t_GPCS")
public class GoldenPriceConsolidatedStatus implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "GPCS_OID")
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INSTR_ID")
    private Issue issue;

    @OneToMany(mappedBy = "goldenPrice", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<MatrixDefinitionInstancePriceStatus> goldenPriceCurveParticipents;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Issue getIssue()
    {
        return issue;
    }

    public void setIssue(Issue issue)
    {
        this.issue = issue;
    }

    public Set<MatrixDefinitionInstancePriceStatus> getGoldenPriceCurveParticipents()
    {
        return goldenPriceCurveParticipents;
    }

    public void setGoldenPriceCurveParticipents(Set<MatrixDefinitionInstancePriceStatus> goldenPriceCurveParticipents)
    {
        this.goldenPriceCurveParticipents = goldenPriceCurveParticipents;
    }

}
