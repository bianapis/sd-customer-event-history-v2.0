package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceAnalysis
 */
public class CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceAnalysis   {
  private String customerEventLogInstanceAnalysisData = null;

  private String customerEventLogInstanceAnalysisReportType = null;

  private Object customerEventLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerEventLogInstanceAnalysisData
  **/

  public String getCustomerEventLogInstanceAnalysisData() {
    return customerEventLogInstanceAnalysisData;
  }

  public void setCustomerEventLogInstanceAnalysisData(String customerEventLogInstanceAnalysisData) {
    this.customerEventLogInstanceAnalysisData = customerEventLogInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerEventLogInstanceAnalysisReport
  **/

  public Object getCustomerEventLogInstanceAnalysisReport() {
    return customerEventLogInstanceAnalysisReport;
  }

  public void setCustomerEventLogInstanceAnalysisReport(Object customerEventLogInstanceAnalysisReport) {
    this.customerEventLogInstanceAnalysisReport = customerEventLogInstanceAnalysisReport;
  }


}

