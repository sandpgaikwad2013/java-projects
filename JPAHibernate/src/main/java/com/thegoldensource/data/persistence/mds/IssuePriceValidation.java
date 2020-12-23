package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_ISPS")
@Where(clause = " END_TMS IS NULL ")
public class IssuePriceValidation implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ISPS_OID")
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISS_PRC_ID")
    IssuePrice issuePrice;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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
