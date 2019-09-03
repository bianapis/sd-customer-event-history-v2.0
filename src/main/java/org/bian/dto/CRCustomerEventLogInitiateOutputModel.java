package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogInitiateOutputModel
 */
public class CRCustomerEventLogInitiateOutputModel   {
  private String customerEventLogInstanceReference = null;

  private String customerEventLogInitiateActionReference = null;

  private Object customerEventLogInitiateActionRecord = null;

  private String customerEventLogInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerEventLogInitiateActionReference
  **/

  public String getCustomerEventLogInitiateActionReference() {
    return customerEventLogInitiateActionReference;
  }

  public void setCustomerEventLogInitiateActionReference(String customerEventLogInitiateActionReference) {
    this.customerEventLogInitiateActionReference = customerEventLogInitiateActionReference;
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


}

