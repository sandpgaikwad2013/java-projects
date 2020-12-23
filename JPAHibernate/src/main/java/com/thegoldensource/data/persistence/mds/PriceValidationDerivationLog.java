package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_PRVL")
@Where(clause = " DATA_STAT_TYP IS NULL OR DATA_STAT_TYP='ACTIVE' ")
public class PriceValidationDerivationLog implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "PRVL_OID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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

    public Issue getIssue()
    {
        return issue;
    }

    public void setIssue(Issue issue)
    {
        this.issue = issue;
    }

}
