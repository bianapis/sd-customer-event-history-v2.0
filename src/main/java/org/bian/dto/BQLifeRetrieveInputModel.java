package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLifeRetrieveInputModelLifeInstanceAnalysis;
import org.bian.dto.BQLifeRetrieveInputModelLifeInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLifeRetrieveInputModel
 */
public class BQLifeRetrieveInputModel   {
  private Object lifeRetrieveActionTaskRecord = null;

  private String lifeRetrieveActionRequest = null;

  private BQLifeRetrieveInputModelLifeInstanceReport lifeInstanceReport = null;

  private BQLifeRetrieveInputModelLifeInstanceAnalysis lifeInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return lifeRetrieveActionTaskRecord
  **/

  public Object getLifeRetrieveActionTaskRecord() {
    return lifeRetrieveActionTaskRecord;
  }

  public void setLifeRetrieveActionTaskRecord(Object lifeRetrieveActionTaskRecord) {
    this.lifeRetrieveActionTaskRecord = lifeRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return lifeRetrieveActionRequest
  **/

  public String getLifeRetrieveActionRequest() {
    return lifeRetrieveActionRequest;
  }

  public void setLifeRetrieveActionRequest(String lifeRetrieveActionRequest) {
    this.lifeRetrieveActionRequest = lifeRetrieveActionRequest;
  }


  /**
   * Get lifeInstanceReport
   * @return lifeInstanceReport
  **/

  public BQLifeRetrieveInputModelLifeInstanceReport getLifeInstanceReport() {
    return lifeInstanceReport;
  }

  public void setLifeInstanceReport(BQLifeRetrieveInputModelLifeInstanceReport lifeInstanceReport) {
    this.lifeInstanceReport = lifeInstanceReport;
  }


  /**
   * Get lifeInstanceAnalysis
   * @return lifeInstanceAnalysis
  **/

  public BQLifeRetrieveInputModelLifeInstanceAnalysis getLifeInstanceAnalysis() {
    return lifeInstanceAnalysis;
  }

  public void setLifeInstanceAnalysis(BQLifeRetrieveInputModelLifeInstanceAnalysis lifeInstanceAnalysis) {
    this.lifeInstanceAnalysis = lifeInstanceAnalysis;
  }


}

