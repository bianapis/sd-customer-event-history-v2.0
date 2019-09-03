package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudUpdateInputModelFraudInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFraudUpdateInputModel
 */
public class BQFraudUpdateInputModel   {
  private String customerEventLogInstanceReference = null;

  private String fraudInstanceReference = null;

  private BQFraudUpdateInputModelFraudInstanceRecord fraudInstanceRecord = null;

  private Object fraudUpdateActionTaskRecord = null;

  private String fraudUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud instance 
   * @return fraudInstanceReference
  **/

  public String getFraudInstanceReference() {
    return fraudInstanceReference;
  }

  public void setFraudInstanceReference(String fraudInstanceReference) {
    this.fraudInstanceReference = fraudInstanceReference;
  }


  /**
   * Get fraudInstanceRecord
   * @return fraudInstanceRecord
  **/

  public BQFraudUpdateInputModelFraudInstanceRecord getFraudInstanceRecord() {
    return fraudInstanceRecord;
  }

  public void setFraudInstanceRecord(BQFraudUpdateInputModelFraudInstanceRecord fraudInstanceRecord) {
    this.fraudInstanceRecord = fraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fraudUpdateActionTaskRecord
  **/

  public Object getFraudUpdateActionTaskRecord() {
    return fraudUpdateActionTaskRecord;
  }

  public void setFraudUpdateActionTaskRecord(Object fraudUpdateActionTaskRecord) {
    this.fraudUpdateActionTaskRecord = fraudUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return fraudUpdateActionRequest
  **/

  public String getFraudUpdateActionRequest() {
    return fraudUpdateActionRequest;
  }

  public void setFraudUpdateActionRequest(String fraudUpdateActionRequest) {
    this.fraudUpdateActionRequest = fraudUpdateActionRequest;
  }


}

