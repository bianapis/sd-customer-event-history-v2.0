package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveOutputModelFraudInstanceRecord
 */
public class BQFraudRetrieveOutputModelFraudInstanceRecord   {
  private String customerFraudCaseEventType = null;

  private String customerContactRecordReference = null;

  private String accessedProductService = null;

  private String employeeUnitReference = null;

  private String fraudCaseReference = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of event (e.g. stolen card, disputed transaction) 
   * @return customerFraudCaseEventType
  **/

  public String getCustomerFraudCaseEventType() {
    return customerFraudCaseEventType;
  }

  public void setCustomerFraudCaseEventType(String customerFraudCaseEventType) {
    this.customerFraudCaseEventType = customerFraudCaseEventType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a contact event log 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the types or instances of products/services being serviced if provided 
   * @return accessedProductService
  **/

  public String getAccessedProductService() {
    return accessedProductService;
  }

  public void setAccessedProductService(String accessedProductService) {
    this.accessedProductService = accessedProductService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in recording the fraud case 
   * @return employeeUnitReference
  **/

  public String getEmployeeUnitReference() {
    return employeeUnitReference;
  }

  public void setEmployeeUnitReference(String employeeUnitReference) {
    this.employeeUnitReference = employeeUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the fraud case processing the analysis and response 
   * @return fraudCaseReference
  **/

  public String getFraudCaseReference() {
    return fraudCaseReference;
  }

  public void setFraudCaseReference(String fraudCaseReference) {
    this.fraudCaseReference = fraudCaseReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Date and time and the location the event was captured 
   * @return dateTimeLocation
  **/

  public String getDateTimeLocation() {
    return dateTimeLocation;
  }

  public void setDateTimeLocation(String dateTimeLocation) {
    this.dateTimeLocation = dateTimeLocation;
  }


}

