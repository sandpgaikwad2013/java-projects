package com.jpahibernate.spring.orm.model;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FT_T_ISSU")
public class Issue implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "INSTR_ID")
    private String id;

    @OneToMany(mappedBy = "issue", fetch = FetchType.LAZY)
    private Set<GoldenPriceConsolidatedStatus> goldenPriceConsolidatedStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISS_TYP")
    private IssueType issueType;

    @OneToOne(mappedBy = "issue", fetch = FetchType.LAZY)
    private OptionsCharacteristics optionsCharacteristics;

    @OneToOne(mappedBy = "issue", fetch = FetchType.LAZY)
    private MiscellaneousCharacteristics miscellaneousCharacteristics;

    @OneToMany(mappedBy = "issue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<IssueCalculatedValue> issueCalculatedValues;

    @OneToMany(mappedBy = "issue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<PriceValidationDerivationLog> priceValidationDerivationLogs;

    public Set<GoldenPriceConsolidatedStatus> getGoldenPriceConsolidatedStatus()
    {
        return goldenPriceConsolidatedStatus;
    }

    public void setGoldenPriceConsolidatedStatus(Set<GoldenPriceConsolidatedStatus> goldenPriceConsolidatedStatus)
    {
        this.goldenPriceConsolidatedStatus = goldenPriceConsolidatedStatus;
    }

    public OptionsCharacteristics getOptionsCharacteristics()
    {
        return optionsCharacteristics;
    }

    public void setOptionsCharacteristics(OptionsCharacteristics optionsCharacteristics)
    {
        this.optionsCharacteristics = optionsCharacteristics;
    }

    public MiscellaneousCharacteristics getMiscellaneousCharacteristics()
    {
        return miscellaneousCharacteristics;
    }

    public void setMiscellaneousCharacteristics(MiscellaneousCharacteristics miscellaneousCharacteristics)
    {
        this.miscellaneousCharacteristics = miscellaneousCharacteristics;
    }

    public Set<IssueCalculatedValue> getIssueCalculatedValues()
    {
        return issueCalculatedValues;
    }

    public void setIssueCalculatedValues(Set<IssueCalculatedValue> issueCalculatedValues)
    {
        this.issueCalculatedValues = issueCalculatedValues;
    }

    public Set<PriceValidationDerivationLog> getPriceValidationDerivationLogs()
    {
        return priceValidationDerivationLogs;
    }

    public void setPriceValidationDerivationLogs(Set<PriceValidationDerivationLog> priceValidationDerivationLogs)
    {
        this.priceValidationDerivationLogs = priceValidationDerivationLogs;
    }

}
