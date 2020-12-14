package com.jpahibernate.spring.orm.model;

import java.io.Serializable;
import java.util.Set;

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

    @OneToMany(mappedBy = "matrixDefinitionInstance", fetch = FetchType.EAGER)
    private Set<MatrixGridDetails> matrixGridDetails;

    @ManyToOne
    @JoinColumn(name = "MTRX_OID")
    private MatrixDefinition matrixDefinition;

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

}
