package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveOutputModelFraudInstanceReport
 */
public class BQFraudRetrieveOutputModelFraudInstanceReport   {
  private Object fraudInstanceReportRecord = null;

  private String fraudInstanceReportType = null;

  private String fraudInstanceReportParameters = null;

  private Object fraudInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudInstanceReportRecord
  **/

  public Object getFraudInstanceReportRecord() {
    return fraudInstanceReportRecord;
  }

  public void setFraudInstanceReportRecord(Object fraudInstanceReportRecord) {
    this.fraudInstanceReportRecord = fraudInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudInstanceReportType
  **/

  public String getFraudInstanceReportType() {
    return fraudInstanceReportType;
  }

  public void setFraudInstanceReportType(String fraudInstanceReportType) {
    this.fraudInstanceReportType = fraudInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return fraudInstanceReportParameters
  **/

  public String getFraudInstanceReportParameters() {
    return fraudInstanceReportParameters;
  }

  public void setFraudInstanceReportParameters(String fraudInstanceReportParameters) {
    this.fraudInstanceReportParameters = fraudInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudInstanceReport
  **/

  public Object getFraudInstanceReport() {
    return fraudInstanceReport;
  }

  public void setFraudInstanceReport(Object fraudInstanceReport) {
    this.fraudInstanceReport = fraudInstanceReport;
  }


}

