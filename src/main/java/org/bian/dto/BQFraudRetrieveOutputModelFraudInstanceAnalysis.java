package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveOutputModelFraudInstanceAnalysis
 */
public class BQFraudRetrieveOutputModelFraudInstanceAnalysis   {
  private Object fraudInstanceAnalysisRecord = null;

  private String fraudInstanceAnalysisReportType = null;

  private String fraudInstanceAnalysisParameters = null;

  private Object fraudInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudInstanceAnalysisRecord
  **/

  public Object getFraudInstanceAnalysisRecord() {
    return fraudInstanceAnalysisRecord;
  }

  public void setFraudInstanceAnalysisRecord(Object fraudInstanceAnalysisRecord) {
    this.fraudInstanceAnalysisRecord = fraudInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudInstanceAnalysisReportType
  **/

  public String getFraudInstanceAnalysisReportType() {
    return fraudInstanceAnalysisReportType;
  }

  public void setFraudInstanceAnalysisReportType(String fraudInstanceAnalysisReportType) {
    this.fraudInstanceAnalysisReportType = fraudInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return fraudInstanceAnalysisParameters
  **/

  public String getFraudInstanceAnalysisParameters() {
    return fraudInstanceAnalysisParameters;
  }

  public void setFraudInstanceAnalysisParameters(String fraudInstanceAnalysisParameters) {
    this.fraudInstanceAnalysisParameters = fraudInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudInstanceAnalysisReport
  **/

  public Object getFraudInstanceAnalysisReport() {
    return fraudInstanceAnalysisReport;
  }

  public void setFraudInstanceAnalysisReport(Object fraudInstanceAnalysisReport) {
    this.fraudInstanceAnalysisReport = fraudInstanceAnalysisReport;
  }


}

