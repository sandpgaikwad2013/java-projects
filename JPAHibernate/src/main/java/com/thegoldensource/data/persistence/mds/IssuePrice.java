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
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_ISPC")
@Where(clause = " END_TMS IS NULL ")
public class IssuePrice implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ISS_PRC_ID")
    private String id;

    @OneToMany(mappedBy = "issuePrice", fetch = FetchType.LAZY)
    @Where(clause = " END_TMS IS NULL ")
    private Set<IssuePriceValidation> issuePriceValidations;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTR_ID")
    private Issue issue;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Set<IssuePriceValidation> getIssuePriceValidations()
    {
        return issuePriceValidations;
    }

    public void setIssuePriceValidations(Set<IssuePriceValidation> issuePriceValidations)
    {
        this.issuePriceValidations = issuePriceValidations;
    }

    public Issue getIssue()
    {
        return issue;
    }

    public void setIssue(Issue issue)
    {
        this.issue = issue;
    }

}
