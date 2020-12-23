/**
 * 
 */
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

/**
 * @author sgaikwad
 *
 */

@Entity
@Table(name = "FT_T_ISCV")
@Where(clause = " DATA_STAT_TYP IS NULL OR DATA_STAT_TYP='ACTIVE' ")
public class IssueCalculatedValue implements Serializable
{

    private static final long serialVersionUID = 6561284764223789401L;

    @Id
    @Column(name = "ISCV_OID")
    String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INSTR_ID")
    Issue issue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MTDI_OID")
    MatrixDefinitionInstance matrixDefinitionInstance;

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

    public MatrixDefinitionInstance getMatrixDefinitionInstance()
    {
        return matrixDefinitionInstance;
    }

    public void setMatrixDefinitionInstance(MatrixDefinitionInstance matrixDefinitionInstance)
    {
        this.matrixDefinitionInstance = matrixDefinitionInstance;
    }

}
