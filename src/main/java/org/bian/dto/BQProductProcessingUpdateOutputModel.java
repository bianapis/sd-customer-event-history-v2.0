package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductProcessingUpdateInputModelProductProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductProcessingUpdateOutputModel
 */
public class BQProductProcessingUpdateOutputModel   {
  private BQProductProcessingUpdateInputModelProductProcessingInstanceRecord productProcessingInstanceRecord = null;

  private String productProcessingUpdateActionTaskReference = null;

  private Object productProcessingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get productProcessingInstanceRecord
   * @return productProcessingInstanceRecord
  **/

  public BQProductProcessingUpdateInputModelProductProcessingInstanceRecord getProductProcessingInstanceRecord() {
    return productProcessingInstanceRecord;
  }

  public void setProductProcessingInstanceRecord(BQProductProcessingUpdateInputModelProductProcessingInstanceRecord productProcessingInstanceRecord) {
    this.productProcessingInstanceRecord = productProcessingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productProcessingUpdateActionTaskReference
  **/

  public String getProductProcessingUpdateActionTaskReference() {
    return productProcessingUpdateActionTaskReference;
  }

  public void setProductProcessingUpdateActionTaskReference(String productProcessingUpdateActionTaskReference) {
    this.productProcessingUpdateActionTaskReference = productProcessingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productProcessingUpdateActionTaskRecord
  **/

  public Object getProductProcessingUpdateActionTaskRecord() {
    return productProcessingUpdateActionTaskRecord;
  }

  public void setProductProcessingUpdateActionTaskRecord(Object productProcessingUpdateActionTaskRecord) {
    this.productProcessingUpdateActionTaskRecord = productProcessingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

