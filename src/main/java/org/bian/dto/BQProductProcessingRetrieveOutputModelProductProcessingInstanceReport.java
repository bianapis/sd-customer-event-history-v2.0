package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductProcessingRetrieveOutputModelProductProcessingInstanceReport
 */
public class BQProductProcessingRetrieveOutputModelProductProcessingInstanceReport   {
  private Object productProcessingInstanceReportRecord = null;

  private String productProcessingInstanceReportType = null;

  private String productProcessingInstanceReportParameters = null;

  private Object productProcessingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productProcessingInstanceReportRecord
  **/

  public Object getProductProcessingInstanceReportRecord() {
    return productProcessingInstanceReportRecord;
  }

  public void setProductProcessingInstanceReportRecord(Object productProcessingInstanceReportRecord) {
    this.productProcessingInstanceReportRecord = productProcessingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productProcessingInstanceReportType
  **/

  public String getProductProcessingInstanceReportType() {
    return productProcessingInstanceReportType;
  }

  public void setProductProcessingInstanceReportType(String productProcessingInstanceReportType) {
    this.productProcessingInstanceReportType = productProcessingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productProcessingInstanceReportParameters
  **/

  public String getProductProcessingInstanceReportParameters() {
    return productProcessingInstanceReportParameters;
  }

  public void setProductProcessingInstanceReportParameters(String productProcessingInstanceReportParameters) {
    this.productProcessingInstanceReportParameters = productProcessingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productProcessingInstanceReport
  **/

  public Object getProductProcessingInstanceReport() {
    return productProcessingInstanceReport;
  }

  public void setProductProcessingInstanceReport(Object productProcessingInstanceReport) {
    this.productProcessingInstanceReport = productProcessingInstanceReport;
  }


}

