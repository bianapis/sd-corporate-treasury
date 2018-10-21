package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SecuritizationBaseWithID
 */
public class SecuritizationBaseWithID   {
  private String treasuryPlanReference = null;

  private String securitizationTrancheReference = null;

  private String enterpriseFinancialStatements = null;

  private String enterpriseBalanceSheetDetailed = null;

  private String bankSecuritizationPoliciesandGuidelines = null;

  private Object securitizationTranceRecord = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return securitizationTrancheReference
  **/

  public String getSecuritizationTrancheReference() {
    return securitizationTrancheReference;
  }

  public void setSecuritizationTrancheReference(String securitizationTrancheReference) {
    this.securitizationTrancheReference = securitizationTrancheReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return enterpriseFinancialStatements
  **/

  public String getEnterpriseFinancialStatements() {
    return enterpriseFinancialStatements;
  }

  public void setEnterpriseFinancialStatements(String enterpriseFinancialStatements) {
    this.enterpriseFinancialStatements = enterpriseFinancialStatements;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return enterpriseBalanceSheetDetailed
  **/

  public String getEnterpriseBalanceSheetDetailed() {
    return enterpriseBalanceSheetDetailed;
  }

  public void setEnterpriseBalanceSheetDetailed(String enterpriseBalanceSheetDetailed) {
    this.enterpriseBalanceSheetDetailed = enterpriseBalanceSheetDetailed;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return bankSecuritizationPoliciesandGuidelines
  **/

  public String getBankSecuritizationPoliciesandGuidelines() {
    return bankSecuritizationPoliciesandGuidelines;
  }

  public void setBankSecuritizationPoliciesandGuidelines(String bankSecuritizationPoliciesandGuidelines) {
    this.bankSecuritizationPoliciesandGuidelines = bankSecuritizationPoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return securitizationTranceRecord
  **/

  public Object getSecuritizationTranceRecord() {
    return securitizationTranceRecord;
  }

  public void setSecuritizationTranceRecord(Object securitizationTranceRecord) {
    this.securitizationTranceRecord = securitizationTranceRecord;
  }


}

