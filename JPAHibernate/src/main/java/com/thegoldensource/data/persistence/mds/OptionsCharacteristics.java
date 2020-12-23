package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_OPCH")
@Where(clause = " END_TMS IS NULL ")
public class OptionsCharacteristics implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "OPCH_OID")
    private String id;

    public String getId()
    {
        return id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTR_ID")
    private Issue issue;

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
