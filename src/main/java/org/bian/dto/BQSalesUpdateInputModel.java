package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesUpdateInputModelSalesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesUpdateInputModel
 */
public class BQSalesUpdateInputModel   {
  private String customerEventLogInstanceReference = null;

  private String salesInstanceReference = null;

  private BQSalesUpdateInputModelSalesInstanceRecord salesInstanceRecord = null;

  private Object salesUpdateActionTaskRecord = null;

  private String salesUpdateActionRequest = null;


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

  public BQSalesUpdateInputModelSalesInstanceRecord getSalesInstanceRecord() {
    return salesInstanceRecord;
  }

  public void setSalesInstanceRecord(BQSalesUpdateInputModelSalesInstanceRecord salesInstanceRecord) {
    this.salesInstanceRecord = salesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return salesUpdateActionTaskRecord
  **/

  public Object getSalesUpdateActionTaskRecord() {
    return salesUpdateActionTaskRecord;
  }

  public void setSalesUpdateActionTaskRecord(Object salesUpdateActionTaskRecord) {
    this.salesUpdateActionTaskRecord = salesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return salesUpdateActionRequest
  **/

  public String getSalesUpdateActionRequest() {
    return salesUpdateActionRequest;
  }

  public void setSalesUpdateActionRequest(String salesUpdateActionRequest) {
    this.salesUpdateActionRequest = salesUpdateActionRequest;
  }


}

