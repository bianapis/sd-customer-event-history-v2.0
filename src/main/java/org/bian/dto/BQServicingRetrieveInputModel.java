package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRetrieveInputModelServicingInstanceAnalysis;
import org.bian.dto.BQServicingRetrieveInputModelServicingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveInputModel
 */
public class BQServicingRetrieveInputModel   {
  private Object servicingRetrieveActionTaskRecord = null;

  private String servicingRetrieveActionRequest = null;

  private BQServicingRetrieveInputModelServicingInstanceReport servicingInstanceReport = null;

  private BQServicingRetrieveInputModelServicingInstanceAnalysis servicingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return servicingRetrieveActionTaskRecord
  **/

  public Object getServicingRetrieveActionTaskRecord() {
    return servicingRetrieveActionTaskRecord;
  }

  public void setServicingRetrieveActionTaskRecord(Object servicingRetrieveActionTaskRecord) {
    this.servicingRetrieveActionTaskRecord = servicingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return servicingRetrieveActionRequest
  **/

  public String getServicingRetrieveActionRequest() {
    return servicingRetrieveActionRequest;
  }

  public void setServicingRetrieveActionRequest(String servicingRetrieveActionRequest) {
    this.servicingRetrieveActionRequest = servicingRetrieveActionRequest;
  }


  /**
   * Get servicingInstanceReport
   * @return servicingInstanceReport
  **/

  public BQServicingRetrieveInputModelServicingInstanceReport getServicingInstanceReport() {
    return servicingInstanceReport;
  }

  public void setServicingInstanceReport(BQServicingRetrieveInputModelServicingInstanceReport servicingInstanceReport) {
    this.servicingInstanceReport = servicingInstanceReport;
  }


  /**
   * Get servicingInstanceAnalysis
   * @return servicingInstanceAnalysis
  **/

  public BQServicingRetrieveInputModelServicingInstanceAnalysis getServicingInstanceAnalysis() {
    return servicingInstanceAnalysis;
  }

  public void setServicingInstanceAnalysis(BQServicingRetrieveInputModelServicingInstanceAnalysis servicingInstanceAnalysis) {
    this.servicingInstanceAnalysis = servicingInstanceAnalysis;
  }


}

