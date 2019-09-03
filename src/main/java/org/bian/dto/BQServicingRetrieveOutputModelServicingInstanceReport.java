package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveOutputModelServicingInstanceReport
 */
public class BQServicingRetrieveOutputModelServicingInstanceReport   {
  private Object servicingInstanceReportRecord = null;

  private String servicingInstanceReportType = null;

  private String servicingInstanceReportParameters = null;

  private Object servicingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return servicingInstanceReportRecord
  **/

  public Object getServicingInstanceReportRecord() {
    return servicingInstanceReportRecord;
  }

  public void setServicingInstanceReportRecord(Object servicingInstanceReportRecord) {
    this.servicingInstanceReportRecord = servicingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return servicingInstanceReportType
  **/

  public String getServicingInstanceReportType() {
    return servicingInstanceReportType;
  }

  public void setServicingInstanceReportType(String servicingInstanceReportType) {
    this.servicingInstanceReportType = servicingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return servicingInstanceReportParameters
  **/

  public String getServicingInstanceReportParameters() {
    return servicingInstanceReportParameters;
  }

  public void setServicingInstanceReportParameters(String servicingInstanceReportParameters) {
    this.servicingInstanceReportParameters = servicingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return servicingInstanceReport
  **/

  public Object getServicingInstanceReport() {
    return servicingInstanceReport;
  }

  public void setServicingInstanceReport(Object servicingInstanceReport) {
    this.servicingInstanceReport = servicingInstanceReport;
  }


}

