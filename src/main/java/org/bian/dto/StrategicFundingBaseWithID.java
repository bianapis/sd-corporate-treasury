package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * StrategicFundingBaseWithID
 */
public class StrategicFundingBaseWithID   {
  private String treasuryPlanReference = null;

  private String enterpriseLongTermFundingManagementAnalysis = null;

  private String financialPerformanceandBalanceSheetProjections = null;

  private String ecMDCMMarketTransactions = null;

  private String strategicInvestmentHoldingsTransactions = null;

  private String capitalWholesaleMarketTransactions = null;

  private String enterpriseBalanceSheetPositions = null;


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
   * @return enterpriseLongTermFundingManagementAnalysis
  **/

  public String getEnterpriseLongTermFundingManagementAnalysis() {
    return enterpriseLongTermFundingManagementAnalysis;
  }

  public void setEnterpriseLongTermFundingManagementAnalysis(String enterpriseLongTermFundingManagementAnalysis) {
    this.enterpriseLongTermFundingManagementAnalysis = enterpriseLongTermFundingManagementAnalysis;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return financialPerformanceandBalanceSheetProjections
  **/

  public String getFinancialPerformanceandBalanceSheetProjections() {
    return financialPerformanceandBalanceSheetProjections;
  }

  public void setFinancialPerformanceandBalanceSheetProjections(String financialPerformanceandBalanceSheetProjections) {
    this.financialPerformanceandBalanceSheetProjections = financialPerformanceandBalanceSheetProjections;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return ecMDCMMarketTransactions
  **/

  public String getEcMDCMMarketTransactions() {
    return ecMDCMMarketTransactions;
  }

  public void setEcMDCMMarketTransactions(String ecMDCMMarketTransactions) {
    this.ecMDCMMarketTransactions = ecMDCMMarketTransactions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return strategicInvestmentHoldingsTransactions
  **/

  public String getStrategicInvestmentHoldingsTransactions() {
    return strategicInvestmentHoldingsTransactions;
  }

  public void setStrategicInvestmentHoldingsTransactions(String strategicInvestmentHoldingsTransactions) {
    this.strategicInvestmentHoldingsTransactions = strategicInvestmentHoldingsTransactions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return capitalWholesaleMarketTransactions
  **/

  public String getCapitalWholesaleMarketTransactions() {
    return capitalWholesaleMarketTransactions;
  }

  public void setCapitalWholesaleMarketTransactions(String capitalWholesaleMarketTransactions) {
    this.capitalWholesaleMarketTransactions = capitalWholesaleMarketTransactions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return enterpriseBalanceSheetPositions
  **/

  public String getEnterpriseBalanceSheetPositions() {
    return enterpriseBalanceSheetPositions;
  }

  public void setEnterpriseBalanceSheetPositions(String enterpriseBalanceSheetPositions) {
    this.enterpriseBalanceSheetPositions = enterpriseBalanceSheetPositions;
  }


}

