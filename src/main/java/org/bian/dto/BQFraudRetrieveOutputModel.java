package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.BQFraudRetrieveOutputModelFraudInstanceAnalysis;
import org.bian.dto.BQFraudRetrieveOutputModelFraudInstanceRecord;
import org.bian.dto.BQFraudRetrieveOutputModelFraudInstanceReport;

import javax.validation.Valid;
  
/**
 * BQFraudRetrieveOutputModel
 */
public class BQFraudRetrieveOutputModel   {
  private BQFraudRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private BQFraudRetrieveOutputModelFraudInstanceRecord fraudInstanceRecord = null;

  private String fraudRetrieveActionTaskReference = null;

  private Object fraudRetrieveActionTaskRecord = null;

  private String fraudRetrieveActionResponse = null;

  private BQFraudRetrieveOutputModelFraudInstanceReport fraudInstanceReport = null;

  private BQFraudRetrieveOutputModelFraudInstanceAnalysis fraudInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public BQFraudRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }

  public void setCRCustomerEventLogInstanceRecord(BQFraudRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * Get fraudInstanceRecord
   * @return fraudInstanceRecord
  **/

  public BQFraudRetrieveOutputModelFraudInstanceRecord getFraudInstanceRecord() {
    return fraudInstanceRecord;
  }

  public void setFraudInstanceRecord(BQFraudRetrieveOutputModelFraudInstanceRecord fraudInstanceRecord) {
    this.fraudInstanceRecord = fraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud instance retrieve service call 
   * @return fraudRetrieveActionTaskReference
  **/

  public String getFraudRetrieveActionTaskReference() {
    return fraudRetrieveActionTaskReference;
  }

  public void setFraudRetrieveActionTaskReference(String fraudRetrieveActionTaskReference) {
    this.fraudRetrieveActionTaskReference = fraudRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudRetrieveActionResponse
  **/

  public String getFraudRetrieveActionResponse() {
    return fraudRetrieveActionResponse;
  }

  public void setFraudRetrieveActionResponse(String fraudRetrieveActionResponse) {
    this.fraudRetrieveActionResponse = fraudRetrieveActionResponse;
  }


  /**
   * Get fraudInstanceReport
   * @return fraudInstanceReport
  **/

  public BQFraudRetrieveOutputModelFraudInstanceReport getFraudInstanceReport() {
    return fraudInstanceReport;
  }

  public void setFraudInstanceReport(BQFraudRetrieveOutputModelFraudInstanceReport fraudInstanceReport) {
    this.fraudInstanceReport = fraudInstanceReport;
  }


  /**
   * Get fraudInstanceAnalysis
   * @return fraudInstanceAnalysis
  **/

  public BQFraudRetrieveOutputModelFraudInstanceAnalysis getFraudInstanceAnalysis() {
    return fraudInstanceAnalysis;
  }

  public void setFraudInstanceAnalysis(BQFraudRetrieveOutputModelFraudInstanceAnalysis fraudInstanceAnalysis) {
    this.fraudInstanceAnalysis = fraudInstanceAnalysis;
  }


}

