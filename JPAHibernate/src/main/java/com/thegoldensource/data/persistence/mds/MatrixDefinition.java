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
@Table(name = "FT_T_MTRX")
public class MatrixDefinition implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MTRX_OID")
    private String id;

    @OneToMany(mappedBy = "matrixDefinition", fetch = FetchType.LAZY)
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
