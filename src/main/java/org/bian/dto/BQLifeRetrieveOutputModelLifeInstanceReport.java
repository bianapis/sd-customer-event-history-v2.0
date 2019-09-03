package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLifeRetrieveOutputModelLifeInstanceReport
 */
public class BQLifeRetrieveOutputModelLifeInstanceReport   {
  private Object lifeInstanceReportRecord = null;

  private String lifeInstanceReportType = null;

  private String lifeInstanceReportParameters = null;

  private Object lifeInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return lifeInstanceReportRecord
  **/

  public Object getLifeInstanceReportRecord() {
    return lifeInstanceReportRecord;
  }

  public void setLifeInstanceReportRecord(Object lifeInstanceReportRecord) {
    this.lifeInstanceReportRecord = lifeInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return lifeInstanceReportType
  **/

  public String getLifeInstanceReportType() {
    return lifeInstanceReportType;
  }

  public void setLifeInstanceReportType(String lifeInstanceReportType) {
    this.lifeInstanceReportType = lifeInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return lifeInstanceReportParameters
  **/

  public String getLifeInstanceReportParameters() {
    return lifeInstanceReportParameters;
  }

  public void setLifeInstanceReportParameters(String lifeInstanceReportParameters) {
    this.lifeInstanceReportParameters = lifeInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return lifeInstanceReport
  **/

  public Object getLifeInstanceReport() {
    return lifeInstanceReport;
  }

  public void setLifeInstanceReport(Object lifeInstanceReport) {
    this.lifeInstanceReport = lifeInstanceReport;
  }


}

