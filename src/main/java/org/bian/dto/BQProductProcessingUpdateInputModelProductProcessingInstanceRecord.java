package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductProcessingUpdateInputModelProductProcessingInstanceRecord
 */
public class BQProductProcessingUpdateInputModelProductProcessingInstanceRecord   {
  private String productInstanceReference = null;

  private String productActionEventType = null;

  private String productActionEventDescription = null;

  private String productActionEventResult = null;

  private String employeeUnitReference = null;

  private Object customerProductServiceEventRecord = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the specific product instance being processed 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of event (e.g. payment initiation, statement request) 
   * @return productActionEventType
  **/

  public String getProductActionEventType() {
    return productActionEventType;
  }

  public void setProductActionEventType(String productActionEventType) {
    this.productActionEventType = productActionEventType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the processing activity if available 
   * @return productActionEventDescription
  **/

  public String getProductActionEventDescription() {
    return productActionEventDescription;
  }

  public void setProductActionEventDescription(String productActionEventDescription) {
    this.productActionEventDescription = productActionEventDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outcome of the processing action if available 
   * @return productActionEventResult
  **/

  public String getProductActionEventResult() {
    return productActionEventResult;
  }

  public void setProductActionEventResult(String productActionEventResult) {
    this.productActionEventResult = productActionEventResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employees involved in recording the event 
   * @return employeeUnitReference
  **/

  public String getEmployeeUnitReference() {
    return employeeUnitReference;
  }

  public void setEmployeeUnitReference(String employeeUnitReference) {
    this.employeeUnitReference = employeeUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The details of the event (in a suitable format) 
   * @return customerProductServiceEventRecord
  **/

  public Object getCustomerProductServiceEventRecord() {
    return customerProductServiceEventRecord;
  }

  public void setCustomerProductServiceEventRecord(Object customerProductServiceEventRecord) {
    this.customerProductServiceEventRecord = customerProductServiceEventRecord;
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

