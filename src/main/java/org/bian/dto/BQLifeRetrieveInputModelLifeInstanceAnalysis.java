package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLifeRetrieveInputModelLifeInstanceAnalysis
 */
public class BQLifeRetrieveInputModelLifeInstanceAnalysis   {
  private String lifeInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return lifeInstanceAnalysisReference
  **/

  public String getLifeInstanceAnalysisReference() {
    return lifeInstanceAnalysisReference;
  }

  public void setLifeInstanceAnalysisReference(String lifeInstanceAnalysisReference) {
    this.lifeInstanceAnalysisReference = lifeInstanceAnalysisReference;
  }


}

