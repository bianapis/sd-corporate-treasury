package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * TacticalFundingBaseWithID
 */
public class TacticalFundingBaseWithID   {
  private String treasuryPlanReference = null;

  private String enterpriseShortTermFundingManagementAnalysis = null;

  private String capitalAdequacyRequirements = null;

  private String currencyandRateRiskAnalysis = null;

  private String bankPositionsandHedgingRequirements = null;

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
   * @return enterpriseShortTermFundingManagementAnalysis
  **/

  public String getEnterpriseShortTermFundingManagementAnalysis() {
    return enterpriseShortTermFundingManagementAnalysis;
  }

  public void setEnterpriseShortTermFundingManagementAnalysis(String enterpriseShortTermFundingManagementAnalysis) {
    this.enterpriseShortTermFundingManagementAnalysis = enterpriseShortTermFundingManagementAnalysis;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return capitalAdequacyRequirements
  **/

  public String getCapitalAdequacyRequirements() {
    return capitalAdequacyRequirements;
  }

  public void setCapitalAdequacyRequirements(String capitalAdequacyRequirements) {
    this.capitalAdequacyRequirements = capitalAdequacyRequirements;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return bankPositionsandHedgingRequirements
  **/

  public String getBankPositionsandHedgingRequirements() {
    return bankPositionsandHedgingRequirements;
  }

  public void setBankPositionsandHedgingRequirements(String bankPositionsandHedgingRequirements) {
    this.bankPositionsandHedgingRequirements = bankPositionsandHedgingRequirements;
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

