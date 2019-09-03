package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLifeCaptureOutputModel
 */
public class BQLifeCaptureOutputModel   {
  private String lifeCaptureActionTaskReference = null;

  private Object lifeCaptureActionTaskRecord = null;

  private String lifeCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Life instance capture service call 
   * @return lifeCaptureActionTaskReference
  **/

  public String getLifeCaptureActionTaskReference() {
    return lifeCaptureActionTaskReference;
  }

  public void setLifeCaptureActionTaskReference(String lifeCaptureActionTaskReference) {
    this.lifeCaptureActionTaskReference = lifeCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Life structured input transaction/record 
   * @return lifeCaptureRecordReference
  **/

  public String getLifeCaptureRecordReference() {
    return lifeCaptureRecordReference;
  }

  public void setLifeCaptureRecordReference(String lifeCaptureRecordReference) {
    this.lifeCaptureRecordReference = lifeCaptureRecordReference;
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

