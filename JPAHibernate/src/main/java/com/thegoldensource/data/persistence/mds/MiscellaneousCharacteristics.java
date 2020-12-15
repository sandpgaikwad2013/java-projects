package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_MSCH")
public class MiscellaneousCharacteristics implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MSCH_OID")
    private String id;

    @OneToOne(fetch = FetchType.LAZY)
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
