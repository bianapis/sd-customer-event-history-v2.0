package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRelationshipRetrieveOutputModelRelationshipInstanceAnalysis
 */
public class BQRelationshipRetrieveOutputModelRelationshipInstanceAnalysis   {
  private Object relationshipInstanceAnalysisRecord = null;

  private String relationshipInstanceAnalysisReportType = null;

  private String relationshipInstanceAnalysisParameters = null;

  private Object relationshipInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return relationshipInstanceAnalysisRecord
  **/

  public Object getRelationshipInstanceAnalysisRecord() {
    return relationshipInstanceAnalysisRecord;
  }

  public void setRelationshipInstanceAnalysisRecord(Object relationshipInstanceAnalysisRecord) {
    this.relationshipInstanceAnalysisRecord = relationshipInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return relationshipInstanceAnalysisReportType
  **/

  public String getRelationshipInstanceAnalysisReportType() {
    return relationshipInstanceAnalysisReportType;
  }

  public void setRelationshipInstanceAnalysisReportType(String relationshipInstanceAnalysisReportType) {
    this.relationshipInstanceAnalysisReportType = relationshipInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return relationshipInstanceAnalysisParameters
  **/

  public String getRelationshipInstanceAnalysisParameters() {
    return relationshipInstanceAnalysisParameters;
  }

  public void setRelationshipInstanceAnalysisParameters(String relationshipInstanceAnalysisParameters) {
    this.relationshipInstanceAnalysisParameters = relationshipInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return relationshipInstanceAnalysisReport
  **/

  public Object getRelationshipInstanceAnalysisReport() {
    return relationshipInstanceAnalysisReport;
  }

  public void setRelationshipInstanceAnalysisReport(Object relationshipInstanceAnalysisReport) {
    this.relationshipInstanceAnalysisReport = relationshipInstanceAnalysisReport;
  }


}

