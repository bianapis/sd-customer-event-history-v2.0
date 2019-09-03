package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesRetrieveInputModelSalesInstanceReport
 */
public class BQSalesRetrieveInputModelSalesInstanceReport   {
  private String salesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return salesInstanceReportReference
  **/

  public String getSalesInstanceReportReference() {
    return salesInstanceReportReference;
  }

  public void setSalesInstanceReportReference(String salesInstanceReportReference) {
    this.salesInstanceReportReference = salesInstanceReportReference;
  }


}

