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
@Table(name = "FT_T_ISPC")
public class IssuePrice implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ISS_PRC_ID")
    private String id;

    @OneToMany(mappedBy = "issuePrice", fetch = FetchType.LAZY)
    Set<IssuePriceValidation> issuePriceValidations;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Set<IssuePriceValidation> getIssuePriceValidations()
    {
        return issuePriceValidations;
    }

    public void setIssuePriceValidations(Set<IssuePriceValidation> issuePriceValidations)
    {
        this.issuePriceValidations = issuePriceValidations;
    }

}
