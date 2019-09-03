package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipUpdateInputModelRelationshipInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQRelationshipUpdateOutputModel
 */
public class BQRelationshipUpdateOutputModel   {
  private BQRelationshipUpdateInputModelRelationshipInstanceRecord relationshipInstanceRecord = null;

  private String relationshipUpdateActionTaskReference = null;

  private Object relationshipUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return relationshipUpdateActionTaskReference
  **/

  public String getRelationshipUpdateActionTaskReference() {
    return relationshipUpdateActionTaskReference;
  }

  public void setRelationshipUpdateActionTaskReference(String relationshipUpdateActionTaskReference) {
    this.relationshipUpdateActionTaskReference = relationshipUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

