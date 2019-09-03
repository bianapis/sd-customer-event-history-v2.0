package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRelationshipRetrieveOutputModelRelationshipInstanceReport
 */
public class BQRelationshipRetrieveOutputModelRelationshipInstanceReport   {
  private Object relationshipInstanceReportRecord = null;

  private String relationshipInstanceReportType = null;

  private String relationshipInstanceReportParameters = null;

  private Object relationshipInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return relationshipInstanceReportRecord
  **/

  public Object getRelationshipInstanceReportRecord() {
    return relationshipInstanceReportRecord;
  }

  public void setRelationshipInstanceReportRecord(Object relationshipInstanceReportRecord) {
    this.relationshipInstanceReportRecord = relationshipInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return relationshipInstanceReportType
  **/

  public String getRelationshipInstanceReportType() {
    return relationshipInstanceReportType;
  }

  public void setRelationshipInstanceReportType(String relationshipInstanceReportType) {
    this.relationshipInstanceReportType = relationshipInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return relationshipInstanceReportParameters
  **/

  public String getRelationshipInstanceReportParameters() {
    return relationshipInstanceReportParameters;
  }

  public void setRelationshipInstanceReportParameters(String relationshipInstanceReportParameters) {
    this.relationshipInstanceReportParameters = relationshipInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return relationshipInstanceReport
  **/

  public Object getRelationshipInstanceReport() {
    return relationshipInstanceReport;
  }

  public void setRelationshipInstanceReport(Object relationshipInstanceReport) {
    this.relationshipInstanceReport = relationshipInstanceReport;
  }


}

