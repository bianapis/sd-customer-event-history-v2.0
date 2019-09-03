package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveInputModelServicingInstanceReport
 */
public class BQServicingRetrieveInputModelServicingInstanceReport   {
  private String servicingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return servicingInstanceReportReference
  **/

  public String getServicingInstanceReportReference() {
    return servicingInstanceReportReference;
  }

  public void setServicingInstanceReportReference(String servicingInstanceReportReference) {
    this.servicingInstanceReportReference = servicingInstanceReportReference;
  }


}

