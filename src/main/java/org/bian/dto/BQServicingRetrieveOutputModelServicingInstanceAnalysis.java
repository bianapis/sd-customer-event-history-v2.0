package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveOutputModelServicingInstanceAnalysis
 */
public class BQServicingRetrieveOutputModelServicingInstanceAnalysis   {
  private Object servicingInstanceAnalysisRecord = null;

  private String servicingInstanceAnalysisReportType = null;

  private String servicingInstanceAnalysisParameters = null;

  private Object servicingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return servicingInstanceAnalysisRecord
  **/

  public Object getServicingInstanceAnalysisRecord() {
    return servicingInstanceAnalysisRecord;
  }

  public void setServicingInstanceAnalysisRecord(Object servicingInstanceAnalysisRecord) {
    this.servicingInstanceAnalysisRecord = servicingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return servicingInstanceAnalysisReportType
  **/

  public String getServicingInstanceAnalysisReportType() {
    return servicingInstanceAnalysisReportType;
  }

  public void setServicingInstanceAnalysisReportType(String servicingInstanceAnalysisReportType) {
    this.servicingInstanceAnalysisReportType = servicingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return servicingInstanceAnalysisParameters
  **/

  public String getServicingInstanceAnalysisParameters() {
    return servicingInstanceAnalysisParameters;
  }

  public void setServicingInstanceAnalysisParameters(String servicingInstanceAnalysisParameters) {
    this.servicingInstanceAnalysisParameters = servicingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return servicingInstanceAnalysisReport
  **/

  public Object getServicingInstanceAnalysisReport() {
    return servicingInstanceAnalysisReport;
  }

  public void setServicingInstanceAnalysisReport(Object servicingInstanceAnalysisReport) {
    this.servicingInstanceAnalysisReport = servicingInstanceAnalysisReport;
  }


}

