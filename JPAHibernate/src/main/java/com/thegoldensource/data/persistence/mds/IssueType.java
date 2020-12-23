package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_ISTY")
@Where(clause = " END_TMS IS NULL ")
public class IssueType implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ISS_TYP")
    private String issueType;

    @OneToMany(mappedBy = "issueType", fetch = FetchType.LAZY)
    @Where(clause = " END_TMS IS NULL ")
    private Set<Issue> issues;

    public Set<Issue> getIssues()
    {
        return issues;
    }

    public void setIssues(Set<Issue> issues)
    {
        this.issues = issues;
    }
}
