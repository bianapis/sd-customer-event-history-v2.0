package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEventLogRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceAnalysis;
import org.bian.dto.CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogRetrieveOutputModel
 */
public class CRCustomerEventLogRetrieveOutputModel   {
  private CRCustomerEventLogRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private String customerEventLogRetrieveActionTaskReference = null;

  private Object customerEventLogRetrieveActionTaskRecord = null;

  private String customerEventLogRetrieveActionResponse = null;

  private CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceReportRecord customerEventLogInstanceReportRecord = null;

  private CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceAnalysis customerEventLogInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public CRCustomerEventLogRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }

  public void setCRCustomerEventLogInstanceRecord(CRCustomerEventLogRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Event Log instance retrieve service call 
   * @return customerEventLogRetrieveActionTaskReference
  **/

  public String getCustomerEventLogRetrieveActionTaskReference() {
    return customerEventLogRetrieveActionTaskReference;
  }

  public void setCustomerEventLogRetrieveActionTaskReference(String customerEventLogRetrieveActionTaskReference) {
    this.customerEventLogRetrieveActionTaskReference = customerEventLogRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerEventLogRetrieveActionResponse
  **/

  public String getCustomerEventLogRetrieveActionResponse() {
    return customerEventLogRetrieveActionResponse;
  }

  public void setCustomerEventLogRetrieveActionResponse(String customerEventLogRetrieveActionResponse) {
    this.customerEventLogRetrieveActionResponse = customerEventLogRetrieveActionResponse;
  }


  /**
   * Get customerEventLogInstanceReportRecord
   * @return customerEventLogInstanceReportRecord
  **/

  public CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceReportRecord getCustomerEventLogInstanceReportRecord() {
    return customerEventLogInstanceReportRecord;
  }

  public void setCustomerEventLogInstanceReportRecord(CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceReportRecord customerEventLogInstanceReportRecord) {
    this.customerEventLogInstanceReportRecord = customerEventLogInstanceReportRecord;
  }


  /**
   * Get customerEventLogInstanceAnalysis
   * @return customerEventLogInstanceAnalysis
  **/

  public CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceAnalysis getCustomerEventLogInstanceAnalysis() {
    return customerEventLogInstanceAnalysis;
  }

  public void setCustomerEventLogInstanceAnalysis(CRCustomerEventLogRetrieveOutputModelCustomerEventLogInstanceAnalysis customerEventLogInstanceAnalysis) {
    this.customerEventLogInstanceAnalysis = customerEventLogInstanceAnalysis;
  }


}

