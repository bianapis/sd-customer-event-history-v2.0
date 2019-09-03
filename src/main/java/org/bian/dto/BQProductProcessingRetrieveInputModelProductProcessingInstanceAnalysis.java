package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductProcessingRetrieveInputModelProductProcessingInstanceAnalysis
 */
public class BQProductProcessingRetrieveInputModelProductProcessingInstanceAnalysis   {
  private String productProcessingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productProcessingInstanceAnalysisReference
  **/

  public String getProductProcessingInstanceAnalysisReference() {
    return productProcessingInstanceAnalysisReference;
  }

  public void setProductProcessingInstanceAnalysisReference(String productProcessingInstanceAnalysisReference) {
    this.productProcessingInstanceAnalysisReference = productProcessingInstanceAnalysisReference;
  }


}

