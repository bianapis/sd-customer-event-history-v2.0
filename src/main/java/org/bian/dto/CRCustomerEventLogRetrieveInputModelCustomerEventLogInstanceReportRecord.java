package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceReportRecord
 */
public class CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceReportRecord   {
  private String customerEventLogInstanceReportReference = null;

  private String customerEventLogInstanceReportType = null;

  private String customerEventLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerEventLogInstanceReportReference
  **/

  public String getCustomerEventLogInstanceReportReference() {
    return customerEventLogInstanceReportReference;
  }

  public void setCustomerEventLogInstanceReportReference(String customerEventLogInstanceReportReference) {
    this.customerEventLogInstanceReportReference = customerEventLogInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerEventLogInstanceReportType
  **/

  public String getCustomerEventLogInstanceReportType() {
    return customerEventLogInstanceReportType;
  }

  public void setCustomerEventLogInstanceReportType(String customerEventLogInstanceReportType) {
    this.customerEventLogInstanceReportType = customerEventLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerEventLogInstanceReportParameters
  **/

  public String getCustomerEventLogInstanceReportParameters() {
    return customerEventLogInstanceReportParameters;
  }

  public void setCustomerEventLogInstanceReportParameters(String customerEventLogInstanceReportParameters) {
    this.customerEventLogInstanceReportParameters = customerEventLogInstanceReportParameters;
  }


}

