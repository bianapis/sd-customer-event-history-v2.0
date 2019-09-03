package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudCaptureOutputModel
 */
public class BQFraudCaptureOutputModel   {
  private String fraudCaptureActionTaskReference = null;

  private Object fraudCaptureActionTaskRecord = null;

  private String fraudCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud instance capture service call 
   * @return fraudCaptureActionTaskReference
  **/

  public String getFraudCaptureActionTaskReference() {
    return fraudCaptureActionTaskReference;
  }

  public void setFraudCaptureActionTaskReference(String fraudCaptureActionTaskReference) {
    this.fraudCaptureActionTaskReference = fraudCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud structured input transaction/record 
   * @return fraudCaptureRecordReference
  **/

  public String getFraudCaptureRecordReference() {
    return fraudCaptureRecordReference;
  }

  public void setFraudCaptureRecordReference(String fraudCaptureRecordReference) {
    this.fraudCaptureRecordReference = fraudCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

