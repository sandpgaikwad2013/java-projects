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

@Entity
@Table(name = "FT_T_MTDI")
public class MatrixDefinitionInstance implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MTDI_OID")
    private String id;

    @OneToMany(mappedBy = "matrixDefinitionInstance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<MatrixGridDetails> matrixGridDetails;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MTRX_OID")
    private MatrixDefinition matrixDefinition;

    @OneToMany(mappedBy = "mdsDefinitionInstance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<IssueCurveSurCharacteristics> issueCurveSurCharacteristics;

    @OneToMany(mappedBy = "matrixDefinitionInstance", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<IssueCalculatedValue> issueCalculatedValues;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Set<MatrixGridDetails> getMatrixGridDetails()
    {
        return matrixGridDetails;
    }

    public void setMatrixGridDetails(Set<MatrixGridDetails> matrixGridDetails)
    {
        this.matrixGridDetails = matrixGridDetails;
    }

    public Set<IssueCurveSurCharacteristics> getIssueCurveSurCharacteristics()
    {
        return issueCurveSurCharacteristics;
    }

    public void setIssueCurveSurCharacteristics(Set<IssueCurveSurCharacteristics> issueCurveSurCharacteristics)
    {
        this.issueCurveSurCharacteristics = issueCurveSurCharacteristics;
    }

    public Set<IssueCalculatedValue> getIssueCalculatedValues()
    {
        return issueCalculatedValues;
    }

    public void setIssueCalculatedValues(Set<IssueCalculatedValue> issueCalculatedValues)
    {
        this.issueCalculatedValues = issueCalculatedValues;
    }

}
