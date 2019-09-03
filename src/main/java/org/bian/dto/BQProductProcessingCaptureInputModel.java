package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductProcessingCaptureInputModelProductProcessingInstanceRecord;
import org.bian.dto.BQRelationshipCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQProductProcessingCaptureInputModel
 */
public class BQProductProcessingCaptureInputModel   {
  private String customerEventLogInstanceReference = null;

  private String productProcessingInstanceReference = null;

  private BQProductProcessingCaptureInputModelProductProcessingInstanceRecord productProcessingInstanceRecord = null;

  private Object productProcessingCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Processing instance 
   * @return productProcessingInstanceReference
  **/

  public String getProductProcessingInstanceReference() {
    return productProcessingInstanceReference;
  }

  public void setProductProcessingInstanceReference(String productProcessingInstanceReference) {
    this.productProcessingInstanceReference = productProcessingInstanceReference;
  }


  /**
   * Get productProcessingInstanceRecord
   * @return productProcessingInstanceRecord
  **/

  public BQProductProcessingCaptureInputModelProductProcessingInstanceRecord getProductProcessingInstanceRecord() {
    return productProcessingInstanceRecord;
  }

  public void setProductProcessingInstanceRecord(BQProductProcessingCaptureInputModelProductProcessingInstanceRecord productProcessingInstanceRecord) {
    this.productProcessingInstanceRecord = productProcessingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return productProcessingCaptureActionTaskRecord
  **/

  public Object getProductProcessingCaptureActionTaskRecord() {
    return productProcessingCaptureActionTaskRecord;
  }

  public void setProductProcessingCaptureActionTaskRecord(Object productProcessingCaptureActionTaskRecord) {
    this.productProcessingCaptureActionTaskRecord = productProcessingCaptureActionTaskRecord;
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

