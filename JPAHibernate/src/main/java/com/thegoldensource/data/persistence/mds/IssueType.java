package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_ISTY")
public class IssueType implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ISS_TYP")
    private String issueType;

    @OneToMany(mappedBy = "issueType", fetch = FetchType.LAZY)
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
