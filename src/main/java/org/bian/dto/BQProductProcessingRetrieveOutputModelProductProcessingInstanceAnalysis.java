package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductProcessingRetrieveOutputModelProductProcessingInstanceAnalysis
 */
public class BQProductProcessingRetrieveOutputModelProductProcessingInstanceAnalysis   {
  private Object productProcessingInstanceAnalysisRecord = null;

  private String productProcessingInstanceAnalysisReportType = null;

  private String productProcessingInstanceAnalysisParameters = null;

  private Object productProcessingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productProcessingInstanceAnalysisRecord
  **/

  public Object getProductProcessingInstanceAnalysisRecord() {
    return productProcessingInstanceAnalysisRecord;
  }

  public void setProductProcessingInstanceAnalysisRecord(Object productProcessingInstanceAnalysisRecord) {
    this.productProcessingInstanceAnalysisRecord = productProcessingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productProcessingInstanceAnalysisReportType
  **/

  public String getProductProcessingInstanceAnalysisReportType() {
    return productProcessingInstanceAnalysisReportType;
  }

  public void setProductProcessingInstanceAnalysisReportType(String productProcessingInstanceAnalysisReportType) {
    this.productProcessingInstanceAnalysisReportType = productProcessingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productProcessingInstanceAnalysisParameters
  **/

  public String getProductProcessingInstanceAnalysisParameters() {
    return productProcessingInstanceAnalysisParameters;
  }

  public void setProductProcessingInstanceAnalysisParameters(String productProcessingInstanceAnalysisParameters) {
    this.productProcessingInstanceAnalysisParameters = productProcessingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productProcessingInstanceAnalysisReport
  **/

  public Object getProductProcessingInstanceAnalysisReport() {
    return productProcessingInstanceAnalysisReport;
  }

  public void setProductProcessingInstanceAnalysisReport(Object productProcessingInstanceAnalysisReport) {
    this.productProcessingInstanceAnalysisReport = productProcessingInstanceAnalysisReport;
  }


}

