package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogControlOutputModel
 */
public class CRCustomerEventLogControlOutputModel   {
  private String customerEventLogControlActionTaskReference = null;

  private Object customerEventLogControlActionTaskRecord = null;

  private String customerEventLogControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Event Log instance control processing service call 
   * @return customerEventLogControlActionTaskReference
  **/

  public String getCustomerEventLogControlActionTaskReference() {
    return customerEventLogControlActionTaskReference;
  }

  public void setCustomerEventLogControlActionTaskReference(String customerEventLogControlActionTaskReference) {
    this.customerEventLogControlActionTaskReference = customerEventLogControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerEventLogControlActionTaskRecord
  **/

  public Object getCustomerEventLogControlActionTaskRecord() {
    return customerEventLogControlActionTaskRecord;
  }

  public void setCustomerEventLogControlActionTaskRecord(Object customerEventLogControlActionTaskRecord) {
    this.customerEventLogControlActionTaskRecord = customerEventLogControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerEventLogControlActionResponse
  **/

  public String getCustomerEventLogControlActionResponse() {
    return customerEventLogControlActionResponse;
  }

  public void setCustomerEventLogControlActionResponse(String customerEventLogControlActionResponse) {
    this.customerEventLogControlActionResponse = customerEventLogControlActionResponse;
  }


}

