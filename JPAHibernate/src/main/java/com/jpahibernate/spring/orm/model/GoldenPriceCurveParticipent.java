package com.jpahibernate.spring.orm.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_MTDP")
public class GoldenPriceCurveParticipent implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "MTDP_OID")
    String id;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "GPCS_OID")
    GoldenPrice goldenPrice;

    public GoldenPrice getGoldenPrice()
    {
        return goldenPrice;
    }

    public void setGoldenPrice(GoldenPrice goldenPrice)
    {
        this.goldenPrice = goldenPrice;
    }

}
