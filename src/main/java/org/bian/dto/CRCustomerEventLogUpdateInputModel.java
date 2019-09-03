package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogUpdateInputModel
 */
public class CRCustomerEventLogUpdateInputModel   {
  private String customerEventHistoryServicingSessionReference = null;

  private String customerEventLogInstanceReference = null;

  private Object customerEventLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerEventHistoryServicingSessionReference
  **/

  public String getCustomerEventHistoryServicingSessionReference() {
    return customerEventHistoryServicingSessionReference;
  }

  public void setCustomerEventHistoryServicingSessionReference(String customerEventHistoryServicingSessionReference) {
    this.customerEventHistoryServicingSessionReference = customerEventHistoryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Event Log instance 
   * @return customerEventLogInstanceReference
  **/

  public String getCustomerEventLogInstanceReference() {
    return customerEventLogInstanceReference;
  }

  public void setCustomerEventLogInstanceReference(String customerEventLogInstanceReference) {
    this.customerEventLogInstanceReference = customerEventLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerEventLogUpdateActionTaskRecord
  **/

  public Object getCustomerEventLogUpdateActionTaskRecord() {
    return customerEventLogUpdateActionTaskRecord;
  }

  public void setCustomerEventLogUpdateActionTaskRecord(Object customerEventLogUpdateActionTaskRecord) {
    this.customerEventLogUpdateActionTaskRecord = customerEventLogUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

