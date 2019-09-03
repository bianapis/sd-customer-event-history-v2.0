package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveInputModelServicingInstanceAnalysis
 */
public class BQServicingRetrieveInputModelServicingInstanceAnalysis   {
  private String servicingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return servicingInstanceAnalysisReference
  **/

  public String getServicingInstanceAnalysisReference() {
    return servicingInstanceAnalysisReference;
  }

  public void setServicingInstanceAnalysisReference(String servicingInstanceAnalysisReference) {
    this.servicingInstanceAnalysisReference = servicingInstanceAnalysisReference;
  }


}

