package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * TreasuryPlanBaseWithId
 */
public class TreasuryPlanBaseWithId   {
  private String treasuryPlanReference = null;

  private String treasuryPlanningPoliciesGuidelines = null;

  private String treasuryPlanOperatingParameters = null;

  private String treasuryPlanGoals = null;


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
   * @return treasuryPlanningPoliciesGuidelines
  **/

  public String getTreasuryPlanningPoliciesGuidelines() {
    return treasuryPlanningPoliciesGuidelines;
  }

  public void setTreasuryPlanningPoliciesGuidelines(String treasuryPlanningPoliciesGuidelines) {
    this.treasuryPlanningPoliciesGuidelines = treasuryPlanningPoliciesGuidelines;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return treasuryPlanOperatingParameters
  **/

  public String getTreasuryPlanOperatingParameters() {
    return treasuryPlanOperatingParameters;
  }

  public void setTreasuryPlanOperatingParameters(String treasuryPlanOperatingParameters) {
    this.treasuryPlanOperatingParameters = treasuryPlanOperatingParameters;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return treasuryPlanGoals
  **/

  public String getTreasuryPlanGoals() {
    return treasuryPlanGoals;
  }

  public void setTreasuryPlanGoals(String treasuryPlanGoals) {
    this.treasuryPlanGoals = treasuryPlanGoals;
  }


}

