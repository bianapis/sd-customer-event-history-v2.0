package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesCaptureInputModelSalesInstanceRecord
 */
public class BQSalesCaptureInputModelSalesInstanceRecord   {
  private String customerSalesEventType = null;

  private String employeeUnitReference = null;

  private String productServiceType = null;

  private String leadOpportunityReference = null;

  private Object customerSalesEventRecord = null;

  private String commissionAgreementReference = null;

  private String dateTimeLocation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of event (e.g. campaign, unsolicited, solicited, development) 
   * @return customerSalesEventType
  **/

  public String getCustomerSalesEventType() {
    return customerSalesEventType;
  }

  public void setCustomerSalesEventType(String customerSalesEventType) {
    this.customerSalesEventType = customerSalesEventType;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of product or service being sold 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the recorded lead/opportunity if sale progresses 
   * @return leadOpportunityReference
  **/

  public String getLeadOpportunityReference() {
    return leadOpportunityReference;
  }

  public void setLeadOpportunityReference(String leadOpportunityReference) {
    this.leadOpportunityReference = leadOpportunityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The details of the event (in a suitable format) 
   * @return customerSalesEventRecord
  **/

  public Object getCustomerSalesEventRecord() {
    return customerSalesEventRecord;
  }

  public void setCustomerSalesEventRecord(Object customerSalesEventRecord) {
    this.customerSalesEventRecord = customerSalesEventRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to any commission agreement if appropriate 
   * @return commissionAgreementReference
  **/

  public String getCommissionAgreementReference() {
    return commissionAgreementReference;
  }

  public void setCommissionAgreementReference(String commissionAgreementReference) {
    this.commissionAgreementReference = commissionAgreementReference;
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

