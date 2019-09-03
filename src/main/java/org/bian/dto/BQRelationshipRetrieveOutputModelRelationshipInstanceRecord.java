package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRelationshipRetrieveOutputModelRelationshipInstanceRecord
 */
public class BQRelationshipRetrieveOutputModelRelationshipInstanceRecord   {
  private String customerRelationshipEventType = null;

  private String employeeUnitReference = null;

  private Object customerRelationshipEventRecord = null;

  private String customerRelationshipEventAction = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of event (e.g. advisory, issue resolution, development) 
   * @return customerRelationshipEventType
  **/

  public String getCustomerRelationshipEventType() {
    return customerRelationshipEventType;
  }

  public void setCustomerRelationshipEventType(String customerRelationshipEventType) {
    this.customerRelationshipEventType = customerRelationshipEventType;
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
   * @return customerRelationshipEventRecord
  **/

  public Object getCustomerRelationshipEventRecord() {
    return customerRelationshipEventRecord;
  }

  public void setCustomerRelationshipEventRecord(Object customerRelationshipEventRecord) {
    this.customerRelationshipEventRecord = customerRelationshipEventRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of agreed follow up action (if applicable) 
   * @return customerRelationshipEventAction
  **/

  public String getCustomerRelationshipEventAction() {
    return customerRelationshipEventAction;
  }

  public void setCustomerRelationshipEventAction(String customerRelationshipEventAction) {
    this.customerRelationshipEventAction = customerRelationshipEventAction;
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

