package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipUpdateInputModelRelationshipInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRelationshipUpdateInputModel
 */
public class BQRelationshipUpdateInputModel   {
  private String customerEventLogInstanceReference = null;

  private String relationshipInstanceReference = null;

  private BQRelationshipUpdateInputModelRelationshipInstanceRecord relationshipInstanceRecord = null;

  private Object relationshipUpdateActionTaskRecord = null;

  private String relationshipUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Relationship instance 
   * @return relationshipInstanceReference
  **/

  public String getRelationshipInstanceReference() {
    return relationshipInstanceReference;
  }

  public void setRelationshipInstanceReference(String relationshipInstanceReference) {
    this.relationshipInstanceReference = relationshipInstanceReference;
  }


  /**
   * Get relationshipInstanceRecord
   * @return relationshipInstanceRecord
  **/

  public BQRelationshipUpdateInputModelRelationshipInstanceRecord getRelationshipInstanceRecord() {
    return relationshipInstanceRecord;
  }

  public void setRelationshipInstanceRecord(BQRelationshipUpdateInputModelRelationshipInstanceRecord relationshipInstanceRecord) {
    this.relationshipInstanceRecord = relationshipInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return relationshipUpdateActionTaskRecord
  **/

  public Object getRelationshipUpdateActionTaskRecord() {
    return relationshipUpdateActionTaskRecord;
  }

  public void setRelationshipUpdateActionTaskRecord(Object relationshipUpdateActionTaskRecord) {
    this.relationshipUpdateActionTaskRecord = relationshipUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return relationshipUpdateActionRequest
  **/

  public String getRelationshipUpdateActionRequest() {
    return relationshipUpdateActionRequest;
  }

  public void setRelationshipUpdateActionRequest(String relationshipUpdateActionRequest) {
    this.relationshipUpdateActionRequest = relationshipUpdateActionRequest;
  }


}

