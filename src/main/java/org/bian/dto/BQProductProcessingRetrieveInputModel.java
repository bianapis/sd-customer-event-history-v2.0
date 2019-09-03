package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductProcessingRetrieveInputModelProductProcessingInstanceAnalysis;
import org.bian.dto.BQProductProcessingRetrieveInputModelProductProcessingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductProcessingRetrieveInputModel
 */
public class BQProductProcessingRetrieveInputModel   {
  private Object productProcessingRetrieveActionTaskRecord = null;

  private String productProcessingRetrieveActionRequest = null;

  private BQProductProcessingRetrieveInputModelProductProcessingInstanceReport productProcessingInstanceReport = null;

  private BQProductProcessingRetrieveInputModelProductProcessingInstanceAnalysis productProcessingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productProcessingRetrieveActionTaskRecord
  **/

  public Object getProductProcessingRetrieveActionTaskRecord() {
    return productProcessingRetrieveActionTaskRecord;
  }

  public void setProductProcessingRetrieveActionTaskRecord(Object productProcessingRetrieveActionTaskRecord) {
    this.productProcessingRetrieveActionTaskRecord = productProcessingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productProcessingRetrieveActionRequest
  **/

  public String getProductProcessingRetrieveActionRequest() {
    return productProcessingRetrieveActionRequest;
  }

  public void setProductProcessingRetrieveActionRequest(String productProcessingRetrieveActionRequest) {
    this.productProcessingRetrieveActionRequest = productProcessingRetrieveActionRequest;
  }


  /**
   * Get productProcessingInstanceReport
   * @return productProcessingInstanceReport
  **/

  public BQProductProcessingRetrieveInputModelProductProcessingInstanceReport getProductProcessingInstanceReport() {
    return productProcessingInstanceReport;
  }

  public void setProductProcessingInstanceReport(BQProductProcessingRetrieveInputModelProductProcessingInstanceReport productProcessingInstanceReport) {
    this.productProcessingInstanceReport = productProcessingInstanceReport;
  }


  /**
   * Get productProcessingInstanceAnalysis
   * @return productProcessingInstanceAnalysis
  **/

  public BQProductProcessingRetrieveInputModelProductProcessingInstanceAnalysis getProductProcessingInstanceAnalysis() {
    return productProcessingInstanceAnalysis;
  }

  public void setProductProcessingInstanceAnalysis(BQProductProcessingRetrieveInputModelProductProcessingInstanceAnalysis productProcessingInstanceAnalysis) {
    this.productProcessingInstanceAnalysis = productProcessingInstanceAnalysis;
  }


}

