package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLifeUpdateInputModelLifeInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLifeUpdateInputModel
 */
public class BQLifeUpdateInputModel   {
  private String customerEventLogInstanceReference = null;

  private String lifeInstanceReference = null;

  private BQLifeUpdateInputModelLifeInstanceRecord lifeInstanceRecord = null;

  private Object lifeUpdateActionTaskRecord = null;

  private String lifeUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Event Log instance 
   * @return customerEventLogInstanceReference
  **/

  public String getCustomerEventLogInstanceReference() {
    return customerEventLogInstanceReference;
  }

  public void setCustomerEventLogInstanceReference(String customerEventLogInstanceReference) {
    this.customerEventLogInstanceReference = customerEventLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Life instance 
   * @return lifeInstanceReference
  **/

  public String getLifeInstanceReference() {
    return lifeInstanceReference;
  }

  public void setLifeInstanceReference(String lifeInstanceReference) {
    this.lifeInstanceReference = lifeInstanceReference;
  }


  /**
   * Get lifeInstanceRecord
   * @return lifeInstanceRecord
  **/

  public BQLifeUpdateInputModelLifeInstanceRecord getLifeInstanceRecord() {
    return lifeInstanceRecord;
  }

  public void setLifeInstanceRecord(BQLifeUpdateInputModelLifeInstanceRecord lifeInstanceRecord) {
    this.lifeInstanceRecord = lifeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return lifeUpdateActionTaskRecord
  **/

  public Object getLifeUpdateActionTaskRecord() {
    return lifeUpdateActionTaskRecord;
  }

  public void setLifeUpdateActionTaskRecord(Object lifeUpdateActionTaskRecord) {
    this.lifeUpdateActionTaskRecord = lifeUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return lifeUpdateActionRequest
  **/

  public String getLifeUpdateActionRequest() {
    return lifeUpdateActionRequest;
  }

  public void setLifeUpdateActionRequest(String lifeUpdateActionRequest) {
    this.lifeUpdateActionRequest = lifeUpdateActionRequest;
  }


}

