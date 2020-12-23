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

@Entity
@Table(name = "FT_T_MTGD")
@Where(clause = " END_TMS IS NULL ")
public class MatrixGridDetails implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MTGD_OID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MTDI_OID")
    private MatrixDefinitionInstance matrixDefinitionInstance;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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
