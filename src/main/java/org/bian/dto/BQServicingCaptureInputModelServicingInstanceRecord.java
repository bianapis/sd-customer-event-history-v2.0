package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingCaptureInputModelServicingInstanceRecord
 */
public class BQServicingCaptureInputModelServicingInstanceRecord   {
  private String customerServicingEventType = null;

  private String customerContactRecordReference = null;

  private String accessedProductService = null;

  private String channelDeviceType = null;

  private String contactPurpose = null;

  private String contactResult = null;

  private String employeeUnitReference = null;

  private Object customerServicingEventRecord = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of event (e.g. self-service, assisted) 
   * @return customerServicingEventType
  **/

  public String getCustomerServicingEventType() {
    return customerServicingEventType;
  }

  public void setCustomerServicingEventType(String customerServicingEventType) {
    this.customerServicingEventType = customerServicingEventType;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The channel and device used in the servicing event 
   * @return channelDeviceType
  **/

  public String getChannelDeviceType() {
    return channelDeviceType;
  }

  public void setChannelDeviceType(String channelDeviceType) {
    this.channelDeviceType = channelDeviceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The given purpose for the customer servicing action 
   * @return contactPurpose
  **/

  public String getContactPurpose() {
    return contactPurpose;
  }

  public void setContactPurpose(String contactPurpose) {
    this.contactPurpose = contactPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The captured result of the servicing event 
   * @return contactResult
  **/

  public String getContactResult() {
    return contactResult;
  }

  public void setContactResult(String contactResult) {
    this.contactResult = contactResult;
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
   * @return customerServicingEventRecord
  **/

  public Object getCustomerServicingEventRecord() {
    return customerServicingEventRecord;
  }

  public void setCustomerServicingEventRecord(Object customerServicingEventRecord) {
    this.customerServicingEventRecord = customerServicingEventRecord;
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

