/**
 * 
 */
package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;

import javax.persistence.CascadeType;
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
@Table(name = "FT_T_ICSC")
@Where(clause = " END_TMS IS NULL ")
public class IssueCurveSurCharacteristics implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ICSC_OID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "MTDI_OID")
    private MatrixDefinitionInstance mdsDefinitionInstance;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public MatrixDefinitionInstance getMdsDefinitionInstance()
    {
        return mdsDefinitionInstance;
    }

    public void setMdsDefinitionInstance(MatrixDefinitionInstance mdsDefinitionInstance)
    {
        this.mdsDefinitionInstance = mdsDefinitionInstance;
    }

}
