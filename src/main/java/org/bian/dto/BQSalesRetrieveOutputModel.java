package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesRetrieveOutputModelCRCustomerEventLogInstanceRecord;
import org.bian.dto.BQSalesRetrieveOutputModelSalesInstanceAnalysis;
import org.bian.dto.BQSalesRetrieveOutputModelSalesInstanceRecord;
import org.bian.dto.BQSalesRetrieveOutputModelSalesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSalesRetrieveOutputModel
 */
public class BQSalesRetrieveOutputModel   {
  private BQSalesRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord = null;

  private BQSalesRetrieveOutputModelSalesInstanceRecord salesInstanceRecord = null;

  private String salesRetrieveActionTaskReference = null;

  private Object salesRetrieveActionTaskRecord = null;

  private String salesRetrieveActionResponse = null;

  private BQSalesRetrieveOutputModelSalesInstanceReport salesInstanceReport = null;

  private BQSalesRetrieveOutputModelSalesInstanceAnalysis salesInstanceAnalysis = null;


  /**
   * Get cRCustomerEventLogInstanceRecord
   * @return cRCustomerEventLogInstanceRecord
  **/

  public BQSalesRetrieveOutputModelCRCustomerEventLogInstanceRecord getCRCustomerEventLogInstanceRecord() {
    return cRCustomerEventLogInstanceRecord;
  }

  public void setCRCustomerEventLogInstanceRecord(BQSalesRetrieveOutputModelCRCustomerEventLogInstanceRecord cRCustomerEventLogInstanceRecord) {
    this.cRCustomerEventLogInstanceRecord = cRCustomerEventLogInstanceRecord;
  }


  /**
   * Get salesInstanceRecord
   * @return salesInstanceRecord
  **/

  public BQSalesRetrieveOutputModelSalesInstanceRecord getSalesInstanceRecord() {
    return salesInstanceRecord;
  }

  public void setSalesInstanceRecord(BQSalesRetrieveOutputModelSalesInstanceRecord salesInstanceRecord) {
    this.salesInstanceRecord = salesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Sales instance retrieve service call 
   * @return salesRetrieveActionTaskReference
  **/

  public String getSalesRetrieveActionTaskReference() {
    return salesRetrieveActionTaskReference;
  }

  public void setSalesRetrieveActionTaskReference(String salesRetrieveActionTaskReference) {
    this.salesRetrieveActionTaskReference = salesRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return salesRetrieveActionTaskRecord
  **/

  public Object getSalesRetrieveActionTaskRecord() {
    return salesRetrieveActionTaskRecord;
  }

  public void setSalesRetrieveActionTaskRecord(Object salesRetrieveActionTaskRecord) {
    this.salesRetrieveActionTaskRecord = salesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return salesRetrieveActionResponse
  **/

  public String getSalesRetrieveActionResponse() {
    return salesRetrieveActionResponse;
  }

  public void setSalesRetrieveActionResponse(String salesRetrieveActionResponse) {
    this.salesRetrieveActionResponse = salesRetrieveActionResponse;
  }


  /**
   * Get salesInstanceReport
   * @return salesInstanceReport
  **/

  public BQSalesRetrieveOutputModelSalesInstanceReport getSalesInstanceReport() {
    return salesInstanceReport;
  }

  public void setSalesInstanceReport(BQSalesRetrieveOutputModelSalesInstanceReport salesInstanceReport) {
    this.salesInstanceReport = salesInstanceReport;
  }


  /**
   * Get salesInstanceAnalysis
   * @return salesInstanceAnalysis
  **/

  public BQSalesRetrieveOutputModelSalesInstanceAnalysis getSalesInstanceAnalysis() {
    return salesInstanceAnalysis;
  }

  public void setSalesInstanceAnalysis(BQSalesRetrieveOutputModelSalesInstanceAnalysis salesInstanceAnalysis) {
    this.salesInstanceAnalysis = salesInstanceAnalysis;
  }


}

