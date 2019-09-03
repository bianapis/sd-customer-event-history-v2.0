package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesRetrieveOutputModelSalesInstanceReport
 */
public class BQSalesRetrieveOutputModelSalesInstanceReport   {
  private Object salesInstanceReportRecord = null;

  private String salesInstanceReportType = null;

  private String salesInstanceReportParameters = null;

  private Object salesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return salesInstanceReportRecord
  **/

  public Object getSalesInstanceReportRecord() {
    return salesInstanceReportRecord;
  }

  public void setSalesInstanceReportRecord(Object salesInstanceReportRecord) {
    this.salesInstanceReportRecord = salesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return salesInstanceReportType
  **/

  public String getSalesInstanceReportType() {
    return salesInstanceReportType;
  }

  public void setSalesInstanceReportType(String salesInstanceReportType) {
    this.salesInstanceReportType = salesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return salesInstanceReportParameters
  **/

  public String getSalesInstanceReportParameters() {
    return salesInstanceReportParameters;
  }

  public void setSalesInstanceReportParameters(String salesInstanceReportParameters) {
    this.salesInstanceReportParameters = salesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return salesInstanceReport
  **/

  public Object getSalesInstanceReport() {
    return salesInstanceReport;
  }

  public void setSalesInstanceReport(Object salesInstanceReport) {
    this.salesInstanceReport = salesInstanceReport;
  }


}

