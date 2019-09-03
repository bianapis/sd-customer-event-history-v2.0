package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipCaptureInputModelCaptureRecordType;
import org.bian.dto.BQServicingCaptureInputModelServicingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServicingCaptureInputModel
 */
public class BQServicingCaptureInputModel   {
  private String customerEventLogInstanceReference = null;

  private String servicingInstanceReference = null;

  private BQServicingCaptureInputModelServicingInstanceRecord servicingInstanceRecord = null;

  private Object servicingCaptureActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Servicing instance 
   * @return servicingInstanceReference
  **/

  public String getServicingInstanceReference() {
    return servicingInstanceReference;
  }

  public void setServicingInstanceReference(String servicingInstanceReference) {
    this.servicingInstanceReference = servicingInstanceReference;
  }


  /**
   * Get servicingInstanceRecord
   * @return servicingInstanceRecord
  **/

  public BQServicingCaptureInputModelServicingInstanceRecord getServicingInstanceRecord() {
    return servicingInstanceRecord;
  }

  public void setServicingInstanceRecord(BQServicingCaptureInputModelServicingInstanceRecord servicingInstanceRecord) {
    this.servicingInstanceRecord = servicingInstanceRecord;
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

