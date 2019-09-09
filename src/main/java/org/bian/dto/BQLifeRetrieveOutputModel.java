package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLifeRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.BQLifeRetrieveOutputModelLifeInstanceAnalysis;
import org.bian.dto.BQLifeRetrieveOutputModelLifeInstanceRecord;
import org.bian.dto.BQLifeRetrieveOutputModelLifeInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLifeRetrieveOutputModel
 */
public class BQLifeRetrieveOutputModel   {
  private BQLifeRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private BQLifeRetrieveOutputModelLifeInstanceRecord lifeInstanceRecord = null;

  private String lifeRetrieveActionTaskReference = null;

  private Object lifeRetrieveActionTaskRecord = null;

  private String lifeRetrieveActionResponse = null;

  private BQLifeRetrieveOutputModelLifeInstanceReport lifeInstanceReport = null;

  private BQLifeRetrieveOutputModelLifeInstanceAnalysis lifeInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public BQLifeRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }
  @JsonProperty("cRCustomerEventLogInstanceRecord")
  public void setCRCustomerEventLogInstanceRecord(BQLifeRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * Get lifeInstanceRecord
   * @return lifeInstanceRecord
  **/

  public BQLifeRetrieveOutputModelLifeInstanceRecord getLifeInstanceRecord() {
    return lifeInstanceRecord;
  }

  public void setLifeInstanceRecord(BQLifeRetrieveOutputModelLifeInstanceRecord lifeInstanceRecord) {
    this.lifeInstanceRecord = lifeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Life instance retrieve service call 
   * @return lifeRetrieveActionTaskReference
  **/

  public String getLifeRetrieveActionTaskReference() {
    return lifeRetrieveActionTaskReference;
  }

  public void setLifeRetrieveActionTaskReference(String lifeRetrieveActionTaskReference) {
    this.lifeRetrieveActionTaskReference = lifeRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return lifeRetrieveActionResponse
  **/

  public String getLifeRetrieveActionResponse() {
    return lifeRetrieveActionResponse;
  }

  public void setLifeRetrieveActionResponse(String lifeRetrieveActionResponse) {
    this.lifeRetrieveActionResponse = lifeRetrieveActionResponse;
  }


  /**
   * Get lifeInstanceReport
   * @return lifeInstanceReport
  **/

  public BQLifeRetrieveOutputModelLifeInstanceReport getLifeInstanceReport() {
    return lifeInstanceReport;
  }

  public void setLifeInstanceReport(BQLifeRetrieveOutputModelLifeInstanceReport lifeInstanceReport) {
    this.lifeInstanceReport = lifeInstanceReport;
  }


  /**
   * Get lifeInstanceAnalysis
   * @return lifeInstanceAnalysis
  **/

  public BQLifeRetrieveOutputModelLifeInstanceAnalysis getLifeInstanceAnalysis() {
    return lifeInstanceAnalysis;
  }

  public void setLifeInstanceAnalysis(BQLifeRetrieveOutputModelLifeInstanceAnalysis lifeInstanceAnalysis) {
    this.lifeInstanceAnalysis = lifeInstanceAnalysis;
  }


}

