package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudRetrieveInputModelFraudInstanceAnalysis;
import org.bian.dto.BQFraudRetrieveInputModelFraudInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveInputModel
 */
public class BQFraudRetrieveInputModel   {
  private Object fraudRetrieveActionTaskRecord = null;

  private String fraudRetrieveActionRequest = null;

  private BQFraudRetrieveInputModelFraudInstanceReport fraudInstanceReport = null;

  private BQFraudRetrieveInputModelFraudInstanceAnalysis fraudInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudRetrieveActionTaskRecord
  **/

  public Object getFraudRetrieveActionTaskRecord() {
    return fraudRetrieveActionTaskRecord;
  }

  public void setFraudRetrieveActionTaskRecord(Object fraudRetrieveActionTaskRecord) {
    this.fraudRetrieveActionTaskRecord = fraudRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudRetrieveActionRequest
  **/

  public String getFraudRetrieveActionRequest() {
    return fraudRetrieveActionRequest;
  }

  public void setFraudRetrieveActionRequest(String fraudRetrieveActionRequest) {
    this.fraudRetrieveActionRequest = fraudRetrieveActionRequest;
  }


  /**
   * Get fraudInstanceReport
   * @return fraudInstanceReport
  **/

  public BQFraudRetrieveInputModelFraudInstanceReport getFraudInstanceReport() {
    return fraudInstanceReport;
  }

  public void setFraudInstanceReport(BQFraudRetrieveInputModelFraudInstanceReport fraudInstanceReport) {
    this.fraudInstanceReport = fraudInstanceReport;
  }


  /**
   * Get fraudInstanceAnalysis
   * @return fraudInstanceAnalysis
  **/

  public BQFraudRetrieveInputModelFraudInstanceAnalysis getFraudInstanceAnalysis() {
    return fraudInstanceAnalysis;
  }

  public void setFraudInstanceAnalysis(BQFraudRetrieveInputModelFraudInstanceAnalysis fraudInstanceAnalysis) {
    this.fraudInstanceAnalysis = fraudInstanceAnalysis;
  }


}

