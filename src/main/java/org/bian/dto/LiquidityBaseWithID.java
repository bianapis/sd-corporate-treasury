package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * LiquidityBaseWithID
 */
public class LiquidityBaseWithID   {
  private String treasuryPlanReference = null;

  private String enterpriseLiquidityCashManagementAnalysis = null;

  private String enterpriseBankAccountingCashManagementRecords = null;

  private String enterpriseLargePaymentTransactionRecords = null;

  private String businessUnitFinancialReports = null;

  private String currencyandRateRiskAnalysis = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return treasuryPlanReference
  **/

  public String getTreasuryPlanReference() {
    return treasuryPlanReference;
  }

  public void setTreasuryPlanReference(String treasuryPlanReference) {
    this.treasuryPlanReference = treasuryPlanReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return enterpriseLiquidityCashManagementAnalysis
  **/

  public String getEnterpriseLiquidityCashManagementAnalysis() {
    return enterpriseLiquidityCashManagementAnalysis;
  }

  public void setEnterpriseLiquidityCashManagementAnalysis(String enterpriseLiquidityCashManagementAnalysis) {
    this.enterpriseLiquidityCashManagementAnalysis = enterpriseLiquidityCashManagementAnalysis;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return enterpriseBankAccountingCashManagementRecords
  **/

  public String getEnterpriseBankAccountingCashManagementRecords() {
    return enterpriseBankAccountingCashManagementRecords;
  }

  public void setEnterpriseBankAccountingCashManagementRecords(String enterpriseBankAccountingCashManagementRecords) {
    this.enterpriseBankAccountingCashManagementRecords = enterpriseBankAccountingCashManagementRecords;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return enterpriseLargePaymentTransactionRecords
  **/

  public String getEnterpriseLargePaymentTransactionRecords() {
    return enterpriseLargePaymentTransactionRecords;
  }

  public void setEnterpriseLargePaymentTransactionRecords(String enterpriseLargePaymentTransactionRecords) {
    this.enterpriseLargePaymentTransactionRecords = enterpriseLargePaymentTransactionRecords;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return businessUnitFinancialReports
  **/

  public String getBusinessUnitFinancialReports() {
    return businessUnitFinancialReports;
  }

  public void setBusinessUnitFinancialReports(String businessUnitFinancialReports) {
    this.businessUnitFinancialReports = businessUnitFinancialReports;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return currencyandRateRiskAnalysis
  **/

  public String getCurrencyandRateRiskAnalysis() {
    return currencyandRateRiskAnalysis;
  }

  public void setCurrencyandRateRiskAnalysis(String currencyandRateRiskAnalysis) {
    this.currencyandRateRiskAnalysis = currencyandRateRiskAnalysis;
  }


}

