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
@Table(name = "FT_T_MTRX")
@Where(clause = " END_TMS IS NULL ")
public class MatrixDefinition implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MTRX_OID")
    private String id;

    @OneToMany(mappedBy = "matrixDefinition", fetch = FetchType.LAZY)
    @Where(clause = " END_TMS IS NULL ")
    private Set<MatrixDefinitionInstance> matrixDefinitionInstances;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

}
