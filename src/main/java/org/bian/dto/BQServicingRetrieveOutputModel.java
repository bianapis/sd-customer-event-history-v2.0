package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.BQServicingRetrieveOutputModelServicingInstanceAnalysis;
import org.bian.dto.BQServicingRetrieveOutputModelServicingInstanceRecord;
import org.bian.dto.BQServicingRetrieveOutputModelServicingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQServicingRetrieveOutputModel
 */
public class BQServicingRetrieveOutputModel   {
  private BQServicingRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private BQServicingRetrieveOutputModelServicingInstanceRecord servicingInstanceRecord = null;

  private String servicingRetrieveActionTaskReference = null;

  private Object servicingRetrieveActionTaskRecord = null;

  private String servicingRetrieveActionResponse = null;

  private BQServicingRetrieveOutputModelServicingInstanceReport servicingInstanceReport = null;

  private BQServicingRetrieveOutputModelServicingInstanceAnalysis servicingInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public BQServicingRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }

  public void setCRCustomerEventLogInstanceRecord(BQServicingRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * Get servicingInstanceRecord
   * @return servicingInstanceRecord
  **/

  public BQServicingRetrieveOutputModelServicingInstanceRecord getServicingInstanceRecord() {
    return servicingInstanceRecord;
  }

  public void setServicingInstanceRecord(BQServicingRetrieveOutputModelServicingInstanceRecord servicingInstanceRecord) {
    this.servicingInstanceRecord = servicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Servicing instance retrieve service call 
   * @return servicingRetrieveActionTaskReference
  **/

  public String getServicingRetrieveActionTaskReference() {
    return servicingRetrieveActionTaskReference;
  }

  public void setServicingRetrieveActionTaskReference(String servicingRetrieveActionTaskReference) {
    this.servicingRetrieveActionTaskReference = servicingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return servicingRetrieveActionResponse
  **/

  public String getServicingRetrieveActionResponse() {
    return servicingRetrieveActionResponse;
  }

  public void setServicingRetrieveActionResponse(String servicingRetrieveActionResponse) {
    this.servicingRetrieveActionResponse = servicingRetrieveActionResponse;
  }


  /**
   * Get servicingInstanceReport
   * @return servicingInstanceReport
  **/

  public BQServicingRetrieveOutputModelServicingInstanceReport getServicingInstanceReport() {
    return servicingInstanceReport;
  }

  public void setServicingInstanceReport(BQServicingRetrieveOutputModelServicingInstanceReport servicingInstanceReport) {
    this.servicingInstanceReport = servicingInstanceReport;
  }


  /**
   * Get servicingInstanceAnalysis
   * @return servicingInstanceAnalysis
  **/

  public BQServicingRetrieveOutputModelServicingInstanceAnalysis getServicingInstanceAnalysis() {
    return servicingInstanceAnalysis;
  }

  public void setServicingInstanceAnalysis(BQServicingRetrieveOutputModelServicingInstanceAnalysis servicingInstanceAnalysis) {
    this.servicingInstanceAnalysis = servicingInstanceAnalysis;
  }


}

