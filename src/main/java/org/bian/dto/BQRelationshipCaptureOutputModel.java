package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRelationshipCaptureOutputModel
 */
public class BQRelationshipCaptureOutputModel   {
  private String relationshipCaptureActionTaskReference = null;

  private Object relationshipCaptureActionTaskRecord = null;

  private String relationshipCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Relationship instance capture service call 
   * @return relationshipCaptureActionTaskReference
  **/

  public String getRelationshipCaptureActionTaskReference() {
    return relationshipCaptureActionTaskReference;
  }

  public void setRelationshipCaptureActionTaskReference(String relationshipCaptureActionTaskReference) {
    this.relationshipCaptureActionTaskReference = relationshipCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Relationship structured input transaction/record 
   * @return relationshipCaptureRecordReference
  **/

  public String getRelationshipCaptureRecordReference() {
    return relationshipCaptureRecordReference;
  }

  public void setRelationshipCaptureRecordReference(String relationshipCaptureRecordReference) {
    this.relationshipCaptureRecordReference = relationshipCaptureRecordReference;
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

