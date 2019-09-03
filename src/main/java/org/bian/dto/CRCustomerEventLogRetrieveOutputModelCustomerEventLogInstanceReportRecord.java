package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceReportRecord
 */
public class CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceReportRecord   {
  private String customerEventLogInstanceReportData = null;

  private String customerEventLogInstanceReportType = null;

  private Object customerEventLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerEventLogInstanceReportData
  **/

  public String getCustomerEventLogInstanceReportData() {
    return customerEventLogInstanceReportData;
  }

  public void setCustomerEventLogInstanceReportData(String customerEventLogInstanceReportData) {
    this.customerEventLogInstanceReportData = customerEventLogInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerEventLogInstanceReport
  **/

  public Object getCustomerEventLogInstanceReport() {
    return customerEventLogInstanceReport;
  }

  public void setCustomerEventLogInstanceReport(Object customerEventLogInstanceReport) {
    this.customerEventLogInstanceReport = customerEventLogInstanceReport;
  }


}

