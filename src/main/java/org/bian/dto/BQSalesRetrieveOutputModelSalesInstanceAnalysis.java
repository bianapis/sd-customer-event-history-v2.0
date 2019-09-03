package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesRetrieveOutputModelSalesInstanceAnalysis
 */
public class BQSalesRetrieveOutputModelSalesInstanceAnalysis   {
  private Object salesInstanceAnalysisRecord = null;

  private String salesInstanceAnalysisReportType = null;

  private String salesInstanceAnalysisParameters = null;

  private Object salesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return salesInstanceAnalysisRecord
  **/

  public Object getSalesInstanceAnalysisRecord() {
    return salesInstanceAnalysisRecord;
  }

  public void setSalesInstanceAnalysisRecord(Object salesInstanceAnalysisRecord) {
    this.salesInstanceAnalysisRecord = salesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return salesInstanceAnalysisReportType
  **/

  public String getSalesInstanceAnalysisReportType() {
    return salesInstanceAnalysisReportType;
  }

  public void setSalesInstanceAnalysisReportType(String salesInstanceAnalysisReportType) {
    this.salesInstanceAnalysisReportType = salesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return salesInstanceAnalysisParameters
  **/

  public String getSalesInstanceAnalysisParameters() {
    return salesInstanceAnalysisParameters;
  }

  public void setSalesInstanceAnalysisParameters(String salesInstanceAnalysisParameters) {
    this.salesInstanceAnalysisParameters = salesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return salesInstanceAnalysisReport
  **/

  public Object getSalesInstanceAnalysisReport() {
    return salesInstanceAnalysisReport;
  }

  public void setSalesInstanceAnalysisReport(Object salesInstanceAnalysisReport) {
    this.salesInstanceAnalysisReport = salesInstanceAnalysisReport;
  }


}

