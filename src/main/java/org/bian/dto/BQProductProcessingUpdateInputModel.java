package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductProcessingUpdateInputModelProductProcessingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductProcessingUpdateInputModel
 */
public class BQProductProcessingUpdateInputModel   {
  private String customerEventLogInstanceReference = null;

  private String productProcessingInstanceReference = null;

  private BQProductProcessingUpdateInputModelProductProcessingInstanceRecord productProcessingInstanceRecord = null;

  private Object productProcessingUpdateActionTaskRecord = null;

  private String productProcessingUpdateActionRequest = null;


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

  public BQProductProcessingUpdateInputModelProductProcessingInstanceRecord getProductProcessingInstanceRecord() {
    return productProcessingInstanceRecord;
  }

  public void setProductProcessingInstanceRecord(BQProductProcessingUpdateInputModelProductProcessingInstanceRecord productProcessingInstanceRecord) {
    this.productProcessingInstanceRecord = productProcessingInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productProcessingUpdateActionRequest
  **/

  public String getProductProcessingUpdateActionRequest() {
    return productProcessingUpdateActionRequest;
  }

  public void setProductProcessingUpdateActionRequest(String productProcessingUpdateActionRequest) {
    this.productProcessingUpdateActionRequest = productProcessingUpdateActionRequest;
  }


}

