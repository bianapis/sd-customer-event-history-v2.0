package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipCaptureInputModelCaptureRecordType;
import org.bian.dto.BQSalesCaptureInputModelSalesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesCaptureInputModel
 */
public class BQSalesCaptureInputModel   {
  private String customerEventLogInstanceReference = null;

  private String salesInstanceReference = null;

  private BQSalesCaptureInputModelSalesInstanceRecord salesInstanceRecord = null;

  private Object salesCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales instance 
   * @return salesInstanceReference
  **/

  public String getSalesInstanceReference() {
    return salesInstanceReference;
  }

  public void setSalesInstanceReference(String salesInstanceReference) {
    this.salesInstanceReference = salesInstanceReference;
  }


  /**
   * Get salesInstanceRecord
   * @return salesInstanceRecord
  **/

  public BQSalesCaptureInputModelSalesInstanceRecord getSalesInstanceRecord() {
    return salesInstanceRecord;
  }

  public void setSalesInstanceRecord(BQSalesCaptureInputModelSalesInstanceRecord salesInstanceRecord) {
    this.salesInstanceRecord = salesInstanceRecord;
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

