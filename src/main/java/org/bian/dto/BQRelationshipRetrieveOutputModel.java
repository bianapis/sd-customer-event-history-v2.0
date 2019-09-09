package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRelationshipRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.BQRelationshipRetrieveOutputModelRelationshipInstanceAnalysis;
import org.bian.dto.BQRelationshipRetrieveOutputModelRelationshipInstanceRecord;
import org.bian.dto.BQRelationshipRetrieveOutputModelRelationshipInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRelationshipRetrieveOutputModel
 */
public class BQRelationshipRetrieveOutputModel   {
  private BQRelationshipRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private BQRelationshipRetrieveOutputModelRelationshipInstanceRecord relationshipInstanceRecord = null;

  private String relationshipRetrieveActionTaskReference = null;

  private Object relationshipRetrieveActionTaskRecord = null;

  private String relationshipRetrieveActionResponse = null;

  private BQRelationshipRetrieveOutputModelRelationshipInstanceReport relationshipInstanceReport = null;

  private BQRelationshipRetrieveOutputModelRelationshipInstanceAnalysis relationshipInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public BQRelationshipRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }
  @JsonProperty("cRCustomerEventLogInstanceRecord")
  public void setCRCustomerEventLogInstanceRecord(BQRelationshipRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * Get relationshipInstanceRecord
   * @return relationshipInstanceRecord
  **/

  public BQRelationshipRetrieveOutputModelRelationshipInstanceRecord getRelationshipInstanceRecord() {
    return relationshipInstanceRecord;
  }

  public void setRelationshipInstanceRecord(BQRelationshipRetrieveOutputModelRelationshipInstanceRecord relationshipInstanceRecord) {
    this.relationshipInstanceRecord = relationshipInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Relationship instance retrieve service call 
   * @return relationshipRetrieveActionTaskReference
  **/

  public String getRelationshipRetrieveActionTaskReference() {
    return relationshipRetrieveActionTaskReference;
  }

  public void setRelationshipRetrieveActionTaskReference(String relationshipRetrieveActionTaskReference) {
    this.relationshipRetrieveActionTaskReference = relationshipRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return relationshipRetrieveActionResponse
  **/

  public String getRelationshipRetrieveActionResponse() {
    return relationshipRetrieveActionResponse;
  }

  public void setRelationshipRetrieveActionResponse(String relationshipRetrieveActionResponse) {
    this.relationshipRetrieveActionResponse = relationshipRetrieveActionResponse;
  }


  /**
   * Get relationshipInstanceReport
   * @return relationshipInstanceReport
  **/

  public BQRelationshipRetrieveOutputModelRelationshipInstanceReport getRelationshipInstanceReport() {
    return relationshipInstanceReport;
  }

  public void setRelationshipInstanceReport(BQRelationshipRetrieveOutputModelRelationshipInstanceReport relationshipInstanceReport) {
    this.relationshipInstanceReport = relationshipInstanceReport;
  }


  /**
   * Get relationshipInstanceAnalysis
   * @return relationshipInstanceAnalysis
  **/

  public BQRelationshipRetrieveOutputModelRelationshipInstanceAnalysis getRelationshipInstanceAnalysis() {
    return relationshipInstanceAnalysis;
  }

  public void setRelationshipInstanceAnalysis(BQRelationshipRetrieveOutputModelRelationshipInstanceAnalysis relationshipInstanceAnalysis) {
    this.relationshipInstanceAnalysis = relationshipInstanceAnalysis;
  }


}

