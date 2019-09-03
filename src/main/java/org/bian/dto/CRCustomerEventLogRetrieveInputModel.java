package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceAnalysis;
import org.bian.dto.CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogRetrieveInputModel
 */
public class CRCustomerEventLogRetrieveInputModel   {
  private Object customerEventLogRetrieveActionTaskRecord = null;

  private String customerEventLogRetrieveActionRequest = null;

  private CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceReportRecord customerEventLogInstanceReportRecord = null;

  private CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceAnalysis customerEventLogInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerEventLogRetrieveActionTaskRecord
  **/

  public Object getCustomerEventLogRetrieveActionTaskRecord() {
    return customerEventLogRetrieveActionTaskRecord;
  }

  public void setCustomerEventLogRetrieveActionTaskRecord(Object customerEventLogRetrieveActionTaskRecord) {
    this.customerEventLogRetrieveActionTaskRecord = customerEventLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerEventLogRetrieveActionRequest
  **/

  public String getCustomerEventLogRetrieveActionRequest() {
    return customerEventLogRetrieveActionRequest;
  }

  public void setCustomerEventLogRetrieveActionRequest(String customerEventLogRetrieveActionRequest) {
    this.customerEventLogRetrieveActionRequest = customerEventLogRetrieveActionRequest;
  }


  /**
   * Get customerEventLogInstanceReportRecord
   * @return customerEventLogInstanceReportRecord
  **/

  public CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceReportRecord getCustomerEventLogInstanceReportRecord() {
    return customerEventLogInstanceReportRecord;
  }

  public void setCustomerEventLogInstanceReportRecord(CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceReportRecord customerEventLogInstanceReportRecord) {
    this.customerEventLogInstanceReportRecord = customerEventLogInstanceReportRecord;
  }


  /**
   * Get customerEventLogInstanceAnalysis
   * @return customerEventLogInstanceAnalysis
  **/

  public CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceAnalysis getCustomerEventLogInstanceAnalysis() {
    return customerEventLogInstanceAnalysis;
  }

  public void setCustomerEventLogInstanceAnalysis(CRCustomerEventLogRetrieveInputModelCustomerEventLogInstanceAnalysis customerEventLogInstanceAnalysis) {
    this.customerEventLogInstanceAnalysis = customerEventLogInstanceAnalysis;
  }


}

