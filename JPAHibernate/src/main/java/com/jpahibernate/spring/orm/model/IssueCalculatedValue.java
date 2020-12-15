/**
 * 
 */
package com.jpahibernate.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author sgaikwad
 *
 */

@Entity
@Table(name = "FT_T_ISCV")
public class IssueCalculatedValue implements Serializable
{

    private static final long serialVersionUID = 6561284764223789401L;

    @Id
    @Column(name = "ISCV_OID")
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTR_ID")
    Issue issue;

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
