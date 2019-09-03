package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRelationshipRetrieveInputModelRelationshipInstanceReport
 */
public class BQRelationshipRetrieveInputModelRelationshipInstanceReport   {
  private String relationshipInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return relationshipInstanceReportReference
  **/

  public String getRelationshipInstanceReportReference() {
    return relationshipInstanceReportReference;
  }

  public void setRelationshipInstanceReportReference(String relationshipInstanceReportReference) {
    this.relationshipInstanceReportReference = relationshipInstanceReportReference;
  }


}

