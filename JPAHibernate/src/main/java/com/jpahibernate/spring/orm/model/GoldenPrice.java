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
public class GoldenPrice implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "GPCS_OID")
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INSTR_ID")
    Issue issue;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ISS_PRC_ID")
    IssuePrice issuePrice;

    @OneToMany(mappedBy = "goldenPrice", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    Set<GoldenPriceCurveParticipent> goldenPriceCurveParticipents;

    public IssuePrice getIssuePrice()
    {
        return issuePrice;
    }

    public void setIssuePrice(IssuePrice issuePrice)
    {
        this.issuePrice = issuePrice;
    }

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

    public Set<GoldenPriceCurveParticipent> getGoldenPriceCurveParticipents()
    {
        return goldenPriceCurveParticipents;
    }

    public void setGoldenPriceCurveParticipents(Set<GoldenPriceCurveParticipent> goldenPriceCurveParticipents)
    {
        this.goldenPriceCurveParticipents = goldenPriceCurveParticipents;
    }

}
