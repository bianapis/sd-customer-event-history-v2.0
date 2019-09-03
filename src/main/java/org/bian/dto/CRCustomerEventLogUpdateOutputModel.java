package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogUpdateOutputModel
 */
public class CRCustomerEventLogUpdateOutputModel   {
  private String customerEventLogUpdateActionTaskReference = null;

  private Object customerEventLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerEventLogUpdateActionTaskReference
  **/

  public String getCustomerEventLogUpdateActionTaskReference() {
    return customerEventLogUpdateActionTaskReference;
  }

  public void setCustomerEventLogUpdateActionTaskReference(String customerEventLogUpdateActionTaskReference) {
    this.customerEventLogUpdateActionTaskReference = customerEventLogUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

