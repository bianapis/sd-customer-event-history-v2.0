package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLifeCaptureInputModelLifeInstanceRecord;
import org.bian.dto.BQRelationshipCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQLifeCaptureInputModel
 */
public class BQLifeCaptureInputModel   {
  private String customerEventLogInstanceReference = null;

  private String lifeInstanceReference = null;

  private BQLifeCaptureInputModelLifeInstanceRecord lifeInstanceRecord = null;

  private Object lifeCaptureActionTaskRecord = null;

  private BQRelationshipCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQLifeCaptureInputModelLifeInstanceRecord getLifeInstanceRecord() {
    return lifeInstanceRecord;
  }

  public void setLifeInstanceRecord(BQLifeCaptureInputModelLifeInstanceRecord lifeInstanceRecord) {
    this.lifeInstanceRecord = lifeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return lifeCaptureActionTaskRecord
  **/

  public Object getLifeCaptureActionTaskRecord() {
    return lifeCaptureActionTaskRecord;
  }

  public void setLifeCaptureActionTaskRecord(Object lifeCaptureActionTaskRecord) {
    this.lifeCaptureActionTaskRecord = lifeCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQRelationshipCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQRelationshipCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

