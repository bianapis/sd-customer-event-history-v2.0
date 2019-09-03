package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingCaptureOutputModel
 */
public class BQServicingCaptureOutputModel   {
  private String servicingCaptureActionTaskReference = null;

  private Object servicingCaptureActionTaskRecord = null;

  private String servicingCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing instance capture service call 
   * @return servicingCaptureActionTaskReference
  **/

  public String getServicingCaptureActionTaskReference() {
    return servicingCaptureActionTaskReference;
  }

  public void setServicingCaptureActionTaskReference(String servicingCaptureActionTaskReference) {
    this.servicingCaptureActionTaskReference = servicingCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return servicingCaptureActionTaskRecord
  **/

  public Object getServicingCaptureActionTaskRecord() {
    return servicingCaptureActionTaskRecord;
  }

  public void setServicingCaptureActionTaskRecord(Object servicingCaptureActionTaskRecord) {
    this.servicingCaptureActionTaskRecord = servicingCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing structured input transaction/record 
   * @return servicingCaptureRecordReference
  **/

  public String getServicingCaptureRecordReference() {
    return servicingCaptureRecordReference;
  }

  public void setServicingCaptureRecordReference(String servicingCaptureRecordReference) {
    this.servicingCaptureRecordReference = servicingCaptureRecordReference;
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

