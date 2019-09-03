package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveInputModelFraudInstanceAnalysis
 */
public class BQFraudRetrieveInputModelFraudInstanceAnalysis   {
  private String fraudInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return fraudInstanceAnalysisReference
  **/

  public String getFraudInstanceAnalysisReference() {
    return fraudInstanceAnalysisReference;
  }

  public void setFraudInstanceAnalysisReference(String fraudInstanceAnalysisReference) {
    this.fraudInstanceAnalysisReference = fraudInstanceAnalysisReference;
  }


}

