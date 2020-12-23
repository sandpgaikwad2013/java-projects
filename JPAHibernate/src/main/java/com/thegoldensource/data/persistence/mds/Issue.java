package com.thegoldensource.data.persistence.mds;

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

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "FT_T_ISSU")
@FilterDefs({
        @FilterDef(name = "gpcsFilter", parameters = { @ParamDef(name = "ppedId", type = "string"),
                @ParamDef(name = "downstreamId", type = "string"), @ParamDef(name = "quoteType", type = "string"),
                @ParamDef(name = "ccy", type = "string"), @ParamDef(name = "method", type = "string"),
                @ParamDef(name = "priceType", type = "string"), @ParamDef(name = "addlQualType", type = "string"),
                @ParamDef(name = "prcTms", type = "date"), @ParamDef(name = "startTms", type = "date") }),
        @FilterDef(name = "ispcFilter", parameters = { @ParamDef(name = "ppedId", type = "string"),
                @ParamDef(name = "downstreamId", type = "string"), @ParamDef(name = "quoteType", type = "string"),
                @ParamDef(name = "ccy", type = "string"), @ParamDef(name = "method", type = "string"),
                @ParamDef(name = "priceType", type = "string"), @ParamDef(name = "addlQualType", type = "string"),
                @ParamDef(name = "prcTms", type = "date"), @ParamDef(name = "startTms", type = "date") }),
        @FilterDef(name = "iscvFilter", parameters = { @ParamDef(name = "ppedId", type = "string"),
                @ParamDef(name = "downstreamId", type = "string"), @ParamDef(name = "quoteType", type = "string"),
                @ParamDef(name = "ccy", type = "string"), @ParamDef(name = "method", type = "string"),
                @ParamDef(name = "priceType", type = "string"), @ParamDef(name = "addlQualType", type = "string"),
                @ParamDef(name = "prcTms", type = "date"), @ParamDef(name = "asOfTms", type = "date") }) })
@Where(clause = " END_TMS IS NULL ")
public class Issue implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "INSTR_ID")
    private String id;

    @OneToMany(mappedBy = "issue", fetch = FetchType.LAZY)
    @Where(clause = " END_TMS IS NULL ")
    @Filters({
            @Filter(name = "gpcsFilter", condition = "PPED_OID = :ppedId and DWDF_OID = :downstreamId and PRC_QT_METH_TYP=:quoteType and PRC_CURR_CDE=:ccy and PRCNG_METH_TYP=:method and PRC_TYP=:priceType and ADDNL_PRC_QUAL_TYP=:addlQualType and PRC_TMS=:prcTms and START_TMS=:startTms ") })
    private Set<GoldenPriceConsolidatedStatus> goldenPriceConsolidatedStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISS_TYP")
    private IssueType issueType;

    @OneToOne(mappedBy = "issue", fetch = FetchType.LAZY)
    private OptionsCharacteristics optionsCharacteristics;

    @OneToOne(mappedBy = "issue", fetch = FetchType.LAZY)
    private MiscellaneousCharacteristics miscellaneousCharacteristics;

    @OneToMany(mappedBy = "issue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Where(clause = " DATA_STAT_TYP IS NULL OR DATA_STAT_TYP='ACTIVE' ")
    @Filters({
            @Filter(name = "iscvFilter", condition = "PPED_OID = :ppedId and DWDF_OID = :downstreamId and PRC_QT_METH_TYP=:quoteType and PRC_CURR_CDE=:ccy and PRCNG_METH_TYP=:method and PRC_TYP=:priceType and ADDNL_PRC_QUAL_TYP=:addlQualType and PRC_TMS=:prcTms and AS_OF_TMS=:startTms ") })
    private Set<IssueCalculatedValue> issueCalculatedValues;

    @OneToMany(mappedBy = "issue", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Where(clause = " END_TMS IS NULL ")
    @Filters({
            @Filter(name = "ispcFilter", condition = "PPED_OID = :ppedId and DWDF_OID = :downstreamId and PRC_QT_METH_TYP=:quoteType and PRC_CURR_CDE=:ccy and PRCNG_METH_TYP=:method and PRC_TYP=:priceType and ADDNL_PRC_QUAL_TYP=:addlQualType and PRC_TMS=:prcTms and AS_OF_TMS=:startTms ") })
    private Set<IssuePrice> issuePrice;

    @OneToMany(mappedBy = "issue", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Where(clause = " DATA_STAT_TYP IS NULL OR DATA_STAT_TYP='ACTIVE' ")
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

    public Set<IssuePrice> getIssuePrice()
    {
        return issuePrice;
    }

    public void setIssuePrice(Set<IssuePrice> issuePrice)
    {
        this.issuePrice = issuePrice;
    }

}
