package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipRetrieveInputModelRelationshipInstanceAnalysis;
import org.bian.dto.BQRelationshipRetrieveInputModelRelationshipInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRelationshipRetrieveInputModel
 */
public class BQRelationshipRetrieveInputModel   {
  private Object relationshipRetrieveActionTaskRecord = null;

  private String relationshipRetrieveActionRequest = null;

  private BQRelationshipRetrieveInputModelRelationshipInstanceReport relationshipInstanceReport = null;

  private BQRelationshipRetrieveInputModelRelationshipInstanceAnalysis relationshipInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return relationshipRetrieveActionTaskRecord
  **/

  public Object getRelationshipRetrieveActionTaskRecord() {
    return relationshipRetrieveActionTaskRecord;
  }

  public void setRelationshipRetrieveActionTaskRecord(Object relationshipRetrieveActionTaskRecord) {
    this.relationshipRetrieveActionTaskRecord = relationshipRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return relationshipRetrieveActionRequest
  **/

  public String getRelationshipRetrieveActionRequest() {
    return relationshipRetrieveActionRequest;
  }

  public void setRelationshipRetrieveActionRequest(String relationshipRetrieveActionRequest) {
    this.relationshipRetrieveActionRequest = relationshipRetrieveActionRequest;
  }


  /**
   * Get relationshipInstanceReport
   * @return relationshipInstanceReport
  **/

  public BQRelationshipRetrieveInputModelRelationshipInstanceReport getRelationshipInstanceReport() {
    return relationshipInstanceReport;
  }

  public void setRelationshipInstanceReport(BQRelationshipRetrieveInputModelRelationshipInstanceReport relationshipInstanceReport) {
    this.relationshipInstanceReport = relationshipInstanceReport;
  }


  /**
   * Get relationshipInstanceAnalysis
   * @return relationshipInstanceAnalysis
  **/

  public BQRelationshipRetrieveInputModelRelationshipInstanceAnalysis getRelationshipInstanceAnalysis() {
    return relationshipInstanceAnalysis;
  }

  public void setRelationshipInstanceAnalysis(BQRelationshipRetrieveInputModelRelationshipInstanceAnalysis relationshipInstanceAnalysis) {
    this.relationshipInstanceAnalysis = relationshipInstanceAnalysis;
  }


}

