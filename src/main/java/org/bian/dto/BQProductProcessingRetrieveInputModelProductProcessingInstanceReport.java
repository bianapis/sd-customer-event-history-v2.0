package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductProcessingRetrieveInputModelProductProcessingInstanceReport
 */
public class BQProductProcessingRetrieveInputModelProductProcessingInstanceReport   {
  private String productProcessingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return productProcessingInstanceReportReference
  **/

  public String getProductProcessingInstanceReportReference() {
    return productProcessingInstanceReportReference;
  }

  public void setProductProcessingInstanceReportReference(String productProcessingInstanceReportReference) {
    this.productProcessingInstanceReportReference = productProcessingInstanceReportReference;
  }


}

