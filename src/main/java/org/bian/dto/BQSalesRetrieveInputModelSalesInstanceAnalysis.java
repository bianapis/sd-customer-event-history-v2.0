package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesRetrieveInputModelSalesInstanceAnalysis
 */
public class BQSalesRetrieveInputModelSalesInstanceAnalysis   {
  private String salesInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return salesInstanceAnalysisReference
  **/

  public String getSalesInstanceAnalysisReference() {
    return salesInstanceAnalysisReference;
  }

  public void setSalesInstanceAnalysisReference(String salesInstanceAnalysisReference) {
    this.salesInstanceAnalysisReference = salesInstanceAnalysisReference;
  }


}

