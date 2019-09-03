package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudCaptureInputModelFraudInstanceRecord;
import org.bian.dto.BQRelationshipCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQFraudCaptureInputModel
 */
public class BQFraudCaptureInputModel   {
  private String customerEventLogInstanceReference = null;

  private String fraudInstanceReference = null;

  private BQFraudCaptureInputModelFraudInstanceRecord fraudInstanceRecord = null;

  private Object fraudCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud instance 
   * @return fraudInstanceReference
  **/

  public String getFraudInstanceReference() {
    return fraudInstanceReference;
  }

  public void setFraudInstanceReference(String fraudInstanceReference) {
    this.fraudInstanceReference = fraudInstanceReference;
  }


  /**
   * Get fraudInstanceRecord
   * @return fraudInstanceRecord
  **/

  public BQFraudCaptureInputModelFraudInstanceRecord getFraudInstanceRecord() {
    return fraudInstanceRecord;
  }

  public void setFraudInstanceRecord(BQFraudCaptureInputModelFraudInstanceRecord fraudInstanceRecord) {
    this.fraudInstanceRecord = fraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return fraudCaptureActionTaskRecord
  **/

  public Object getFraudCaptureActionTaskRecord() {
    return fraudCaptureActionTaskRecord;
  }

  public void setFraudCaptureActionTaskRecord(Object fraudCaptureActionTaskRecord) {
    this.fraudCaptureActionTaskRecord = fraudCaptureActionTaskRecord;
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

