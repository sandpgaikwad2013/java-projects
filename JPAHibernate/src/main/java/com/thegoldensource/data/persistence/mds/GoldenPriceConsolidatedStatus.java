package com.thegoldensource.data.persistence.mds;

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

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_t_GPCS")
@Where(clause = " END_TMS IS NULL ")
@FilterDef(name = "mtdiFilter", parameters = @ParamDef(name = "mtdiOid", type = "string"))
public class GoldenPriceConsolidatedStatus implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "GPCS_OID")
    private String id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTR_ID")
    private Issue issue;

    @OneToMany(mappedBy = "goldenPrice", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Where(clause = " END_TMS IS NULL ")
    @Filter(name = "mtdiFilter", condition = "MTDI_OID = :mtdiOid")
    private Set<MatrixDefinitionInstancePriceStatus> goldenPriceCurveParticipents;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISS_PRC_ID")
    private IssuePrice issuePrice;

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

    public IssuePrice getIssuePrice()
    {
        return issuePrice;
    }

    public void setIssuePrice(IssuePrice issuePrice)
    {
        this.issuePrice = issuePrice;
    }

}
