package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BankRatesBaseWithID
 */
public class BankRatesBaseWithID   {
  private String treasuryPlanReference = null;

  private String bankRateRecordReference = null;

  private String bankRateType = null;

  private String bankRateValue = null;

  private String bankRateValueDateTime = null;

  private String bankRateValueHistory = null;

  private Object bankRateRecord = null;

  private String bankRateRecordDateTime = null;


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
   * @return bankRateRecordReference
  **/

  public String getBankRateRecordReference() {
    return bankRateRecordReference;
  }

  public void setBankRateRecordReference(String bankRateRecordReference) {
    this.bankRateRecordReference = bankRateRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return bankRateType
  **/

  public String getBankRateType() {
    return bankRateType;
  }

  public void setBankRateType(String bankRateType) {
    this.bankRateType = bankRateType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Value 
   * @return bankRateValue
  **/

  public String getBankRateValue() {
    return bankRateValue;
  }

  public void setBankRateValue(String bankRateValue) {
    this.bankRateValue = bankRateValue;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return bankRateValueDateTime
  **/

  public String getBankRateValueDateTime() {
    return bankRateValueDateTime;
  }

  public void setBankRateValueDateTime(String bankRateValueDateTime) {
    this.bankRateValueDateTime = bankRateValueDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return bankRateValueHistory
  **/

  public String getBankRateValueHistory() {
    return bankRateValueHistory;
  }

  public void setBankRateValueHistory(String bankRateValueHistory) {
    this.bankRateValueHistory = bankRateValueHistory;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return bankRateRecord
  **/

  public Object getBankRateRecord() {
    return bankRateRecord;
  }

  public void setBankRateRecord(Object bankRateRecord) {
    this.bankRateRecord = bankRateRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return bankRateRecordDateTime
  **/

  public String getBankRateRecordDateTime() {
    return bankRateRecordDateTime;
  }

  public void setBankRateRecordDateTime(String bankRateRecordDateTime) {
    this.bankRateRecordDateTime = bankRateRecordDateTime;
  }


}

