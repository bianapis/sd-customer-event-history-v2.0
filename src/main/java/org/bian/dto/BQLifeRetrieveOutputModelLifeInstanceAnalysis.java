package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLifeRetrieveOutputModelLifeInstanceAnalysis
 */
public class BQLifeRetrieveOutputModelLifeInstanceAnalysis   {
  private Object lifeInstanceAnalysisRecord = null;

  private String lifeInstanceAnalysisReportType = null;

  private String lifeInstanceAnalysisParameters = null;

  private Object lifeInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return lifeInstanceAnalysisRecord
  **/

  public Object getLifeInstanceAnalysisRecord() {
    return lifeInstanceAnalysisRecord;
  }

  public void setLifeInstanceAnalysisRecord(Object lifeInstanceAnalysisRecord) {
    this.lifeInstanceAnalysisRecord = lifeInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return lifeInstanceAnalysisReportType
  **/

  public String getLifeInstanceAnalysisReportType() {
    return lifeInstanceAnalysisReportType;
  }

  public void setLifeInstanceAnalysisReportType(String lifeInstanceAnalysisReportType) {
    this.lifeInstanceAnalysisReportType = lifeInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return lifeInstanceAnalysisParameters
  **/

  public String getLifeInstanceAnalysisParameters() {
    return lifeInstanceAnalysisParameters;
  }

  public void setLifeInstanceAnalysisParameters(String lifeInstanceAnalysisParameters) {
    this.lifeInstanceAnalysisParameters = lifeInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return lifeInstanceAnalysisReport
  **/

  public Object getLifeInstanceAnalysisReport() {
    return lifeInstanceAnalysisReport;
  }

  public void setLifeInstanceAnalysisReport(Object lifeInstanceAnalysisReport) {
    this.lifeInstanceAnalysisReport = lifeInstanceAnalysisReport;
  }


}

