package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLifeRetrieveInputModelLifeInstanceReport
 */
public class BQLifeRetrieveInputModelLifeInstanceReport   {
  private String lifeInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return lifeInstanceReportReference
  **/

  public String getLifeInstanceReportReference() {
    return lifeInstanceReportReference;
  }

  public void setLifeInstanceReportReference(String lifeInstanceReportReference) {
    this.lifeInstanceReportReference = lifeInstanceReportReference;
  }


}

