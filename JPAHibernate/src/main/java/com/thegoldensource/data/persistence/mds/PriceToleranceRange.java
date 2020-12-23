package com.thegoldensource.data.persistence.mds;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_PRTR")
@Where(clause = " DATA_STAT_TYP IS NULL OR DATA_STAT_TYP='ACTIVE' ")
public class PriceToleranceRange implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "PRTR_OID")
    private String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

}
