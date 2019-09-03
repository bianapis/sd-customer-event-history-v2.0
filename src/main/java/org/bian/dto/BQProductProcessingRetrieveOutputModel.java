package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductProcessingRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.BQProductProcessingRetrieveOutputModelProductProcessingInstanceAnalysis;
import org.bian.dto.BQProductProcessingRetrieveOutputModelProductProcessingInstanceRecord;
import org.bian.dto.BQProductProcessingRetrieveOutputModelProductProcessingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductProcessingRetrieveOutputModel
 */
public class BQProductProcessingRetrieveOutputModel   {
  private BQProductProcessingRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private BQProductProcessingRetrieveOutputModelProductProcessingInstanceRecord productProcessingInstanceRecord = null;

  private String productProcessingRetrieveActionTaskReference = null;

  private Object productProcessingRetrieveActionTaskRecord = null;

  private String productProcessingRetrieveActionResponse = null;

  private BQProductProcessingRetrieveOutputModelProductProcessingInstanceReport productProcessingInstanceReport = null;

  private BQProductProcessingRetrieveOutputModelProductProcessingInstanceAnalysis productProcessingInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public BQProductProcessingRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }

  public void setCRCustomerEventLogInstanceRecord(BQProductProcessingRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * Get productProcessingInstanceRecord
   * @return productProcessingInstanceRecord
  **/

  public BQProductProcessingRetrieveOutputModelProductProcessingInstanceRecord getProductProcessingInstanceRecord() {
    return productProcessingInstanceRecord;
  }

  public void setProductProcessingInstanceRecord(BQProductProcessingRetrieveOutputModelProductProcessingInstanceRecord productProcessingInstanceRecord) {
    this.productProcessingInstanceRecord = productProcessingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Product Processing instance retrieve service call 
   * @return productProcessingRetrieveActionTaskReference
  **/

  public String getProductProcessingRetrieveActionTaskReference() {
    return productProcessingRetrieveActionTaskReference;
  }

  public void setProductProcessingRetrieveActionTaskReference(String productProcessingRetrieveActionTaskReference) {
    this.productProcessingRetrieveActionTaskReference = productProcessingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productProcessingRetrieveActionResponse
  **/

  public String getProductProcessingRetrieveActionResponse() {
    return productProcessingRetrieveActionResponse;
  }

  public void setProductProcessingRetrieveActionResponse(String productProcessingRetrieveActionResponse) {
    this.productProcessingRetrieveActionResponse = productProcessingRetrieveActionResponse;
  }


  /**
   * Get productProcessingInstanceReport
   * @return productProcessingInstanceReport
  **/

  public BQProductProcessingRetrieveOutputModelProductProcessingInstanceReport getProductProcessingInstanceReport() {
    return productProcessingInstanceReport;
  }

  public void setProductProcessingInstanceReport(BQProductProcessingRetrieveOutputModelProductProcessingInstanceReport productProcessingInstanceReport) {
    this.productProcessingInstanceReport = productProcessingInstanceReport;
  }


  /**
   * Get productProcessingInstanceAnalysis
   * @return productProcessingInstanceAnalysis
  **/

  public BQProductProcessingRetrieveOutputModelProductProcessingInstanceAnalysis getProductProcessingInstanceAnalysis() {
    return productProcessingInstanceAnalysis;
  }

  public void setProductProcessingInstanceAnalysis(BQProductProcessingRetrieveOutputModelProductProcessingInstanceAnalysis productProcessingInstanceAnalysis) {
    this.productProcessingInstanceAnalysis = productProcessingInstanceAnalysis;
  }


}

