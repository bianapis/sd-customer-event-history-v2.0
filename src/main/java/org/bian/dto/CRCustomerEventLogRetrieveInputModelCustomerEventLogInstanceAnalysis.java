package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceAnalysis
 */
public class CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceAnalysis   {
  private String customerEventLogInstanceAnalysisReference = null;

  private String customerEventLogInstanceAnalysisReportType = null;

  private String customerEventLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerEventLogInstanceAnalysisReference
  **/

  public String getCustomerEventLogInstanceAnalysisReference() {
    return customerEventLogInstanceAnalysisReference;
  }

  public void setCustomerEventLogInstanceAnalysisReference(String customerEventLogInstanceAnalysisReference) {
    this.customerEventLogInstanceAnalysisReference = customerEventLogInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerEventLogInstanceAnalysisReportType
  **/

  public String getCustomerEventLogInstanceAnalysisReportType() {
    return customerEventLogInstanceAnalysisReportType;
  }

  public void setCustomerEventLogInstanceAnalysisReportType(String customerEventLogInstanceAnalysisReportType) {
    this.customerEventLogInstanceAnalysisReportType = customerEventLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerEventLogInstanceAnalysisParameters
  **/

  public String getCustomerEventLogInstanceAnalysisParameters() {
    return customerEventLogInstanceAnalysisParameters;
  }

  public void setCustomerEventLogInstanceAnalysisParameters(String customerEventLogInstanceAnalysisParameters) {
    this.customerEventLogInstanceAnalysisParameters = customerEventLogInstanceAnalysisParameters;
  }


}

