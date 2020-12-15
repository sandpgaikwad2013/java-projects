package com.jpahibernate.spring.orm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_PRTR")
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
