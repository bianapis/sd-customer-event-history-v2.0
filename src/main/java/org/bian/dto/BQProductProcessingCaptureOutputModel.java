package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductProcessingCaptureOutputModel
 */
public class BQProductProcessingCaptureOutputModel   {
  private String productProcessingCaptureActionTaskReference = null;

  private Object productProcessingCaptureActionTaskRecord = null;

  private String productProcessingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Processing instance capture service call 
   * @return productProcessingCaptureActionTaskReference
  **/

  public String getProductProcessingCaptureActionTaskReference() {
    return productProcessingCaptureActionTaskReference;
  }

  public void setProductProcessingCaptureActionTaskReference(String productProcessingCaptureActionTaskReference) {
    this.productProcessingCaptureActionTaskReference = productProcessingCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Product Processing structured input transaction/record 
   * @return productProcessingCaptureRecordReference
  **/

  public String getProductProcessingCaptureRecordReference() {
    return productProcessingCaptureRecordReference;
  }

  public void setProductProcessingCaptureRecordReference(String productProcessingCaptureRecordReference) {
    this.productProcessingCaptureRecordReference = productProcessingCaptureRecordReference;
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

