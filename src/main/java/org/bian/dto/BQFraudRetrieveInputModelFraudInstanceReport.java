package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveInputModelFraudInstanceReport
 */
public class BQFraudRetrieveInputModelFraudInstanceReport   {
  private String fraudInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return fraudInstanceReportReference
  **/

  public String getFraudInstanceReportReference() {
    return fraudInstanceReportReference;
  }

  public void setFraudInstanceReportReference(String fraudInstanceReportReference) {
    this.fraudInstanceReportReference = fraudInstanceReportReference;
  }


}

