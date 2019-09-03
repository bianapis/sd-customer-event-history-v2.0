package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerEventLogControlInputModelCustomerEventLogControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerEventLogControlInputModel
 */
public class CRCustomerEventLogControlInputModel   {
  private String customerEventHistoryServicingSessionReference = null;

  private String customerEventLogInstanceReference = null;

  private Object customerEventLogControlActionTaskRecord = null;

  private CRCustomerEventLogControlInputModelCustomerEventLogControlActionRequest customerEventLogControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerEventHistoryServicingSessionReference
  **/

  public String getCustomerEventHistoryServicingSessionReference() {
    return customerEventHistoryServicingSessionReference;
  }

  public void setCustomerEventHistoryServicingSessionReference(String customerEventHistoryServicingSessionReference) {
    this.customerEventHistoryServicingSessionReference = customerEventHistoryServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Event Log instance 
   * @return customerEventLogInstanceReference
  **/

  public String getCustomerEventLogInstanceReference() {
    return customerEventLogInstanceReference;
  }

  public void setCustomerEventLogInstanceReference(String customerEventLogInstanceReference) {
    this.customerEventLogInstanceReference = customerEventLogInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerEventLogControlActionTaskRecord
  **/

  public Object getCustomerEventLogControlActionTaskRecord() {
    return customerEventLogControlActionTaskRecord;
  }

  public void setCustomerEventLogControlActionTaskRecord(Object customerEventLogControlActionTaskRecord) {
    this.customerEventLogControlActionTaskRecord = customerEventLogControlActionTaskRecord;
  }


  /**
   * Get customerEventLogControlActionRequest
   * @return customerEventLogControlActionRequest
  **/

  public CRCustomerEventLogControlInputModelCustomerEventLogControlActionRequest getCustomerEventLogControlActionRequest() {
    return customerEventLogControlActionRequest;
  }

  public void setCustomerEventLogControlActionRequest(CRCustomerEventLogControlInputModelCustomerEventLogControlActionRequest customerEventLogControlActionRequest) {
    this.customerEventLogControlActionRequest = customerEventLogControlActionRequest;
  }


}

