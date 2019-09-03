package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipCaptureInputModelCaptureRecordType;
import org.bian.dto.BQRelationshipCaptureInputModelRelationshipInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRelationshipCaptureInputModel
 */
public class BQRelationshipCaptureInputModel   {
  private String customerEventLogInstanceReference = null;

  private String relationshipInstanceReference = null;

  private BQRelationshipCaptureInputModelRelationshipInstanceRecord relationshipInstanceRecord = null;

  private Object relationshipCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Relationship instance 
   * @return relationshipInstanceReference
  **/

  public String getRelationshipInstanceReference() {
    return relationshipInstanceReference;
  }

  public void setRelationshipInstanceReference(String relationshipInstanceReference) {
    this.relationshipInstanceReference = relationshipInstanceReference;
  }


  /**
   * Get relationshipInstanceRecord
   * @return relationshipInstanceRecord
  **/

  public BQRelationshipCaptureInputModelRelationshipInstanceRecord getRelationshipInstanceRecord() {
    return relationshipInstanceRecord;
  }

  public void setRelationshipInstanceRecord(BQRelationshipCaptureInputModelRelationshipInstanceRecord relationshipInstanceRecord) {
    this.relationshipInstanceRecord = relationshipInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return relationshipCaptureActionTaskRecord
  **/

  public Object getRelationshipCaptureActionTaskRecord() {
    return relationshipCaptureActionTaskRecord;
  }

  public void setRelationshipCaptureActionTaskRecord(Object relationshipCaptureActionTaskRecord) {
    this.relationshipCaptureActionTaskRecord = relationshipCaptureActionTaskRecord;
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

