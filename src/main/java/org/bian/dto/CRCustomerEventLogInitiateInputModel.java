package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEventLogInitiateInputModelCRCustomerEventLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogInitiateInputModel
 */
public class CRCustomerEventLogInitiateInputModel   {
  private String customerEventHistoryServicingSessionReference = null;

  private Object customerEventLogInitiateActionRecord = null;

  private String customerEventLogInstanceStatus = null;

  private CRCustomerEventLogInitiateInputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerEventLogInitiateActionRecord
  **/

  public Object getCustomerEventLogInitiateActionRecord() {
    return customerEventLogInitiateActionRecord;
  }

  public void setCustomerEventLogInitiateActionRecord(Object customerEventLogInitiateActionRecord) {
    this.customerEventLogInitiateActionRecord = customerEventLogInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Event Log instance (e.g. initialised, pending, active) 
   * @return customerEventLogInstanceStatus
  **/

  public String getCustomerEventLogInstanceStatus() {
    return customerEventLogInstanceStatus;
  }

  public void setCustomerEventLogInstanceStatus(String customerEventLogInstanceStatus) {
    this.customerEventLogInstanceStatus = customerEventLogInstanceStatus;
  }


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public CRCustomerEventLogInitiateInputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }

  public void setCRCustomerEventLogInstanceRecord(CRCustomerEventLogInitiateInputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


}

