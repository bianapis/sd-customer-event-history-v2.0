package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesCaptureOutputModel
 */
public class BQSalesCaptureOutputModel   {
  private String salesCaptureActionTaskReference = null;

  private Object salesCaptureActionTaskRecord = null;

  private String salesCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales instance capture service call 
   * @return salesCaptureActionTaskReference
  **/

  public String getSalesCaptureActionTaskReference() {
    return salesCaptureActionTaskReference;
  }

  public void setSalesCaptureActionTaskReference(String salesCaptureActionTaskReference) {
    this.salesCaptureActionTaskReference = salesCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return salesCaptureActionTaskRecord
  **/

  public Object getSalesCaptureActionTaskRecord() {
    return salesCaptureActionTaskRecord;
  }

  public void setSalesCaptureActionTaskRecord(Object salesCaptureActionTaskRecord) {
    this.salesCaptureActionTaskRecord = salesCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales structured input transaction/record 
   * @return salesCaptureRecordReference
  **/

  public String getSalesCaptureRecordReference() {
    return salesCaptureRecordReference;
  }

  public void setSalesCaptureRecordReference(String salesCaptureRecordReference) {
    this.salesCaptureRecordReference = salesCaptureRecordReference;
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

