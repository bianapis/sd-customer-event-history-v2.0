package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesRetrieveInputModelSalesInstanceAnalysis;
import org.bian.dto.BQSalesRetrieveInputModelSalesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSalesRetrieveInputModel
 */
public class BQSalesRetrieveInputModel   {
  private Object salesRetrieveActionTaskRecord = null;

  private String salesRetrieveActionRequest = null;

  private BQSalesRetrieveInputModelSalesInstanceReport salesInstanceReport = null;

  private BQSalesRetrieveInputModelSalesInstanceAnalysis salesInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return salesRetrieveActionRequest
  **/

  public String getSalesRetrieveActionRequest() {
    return salesRetrieveActionRequest;
  }

  public void setSalesRetrieveActionRequest(String salesRetrieveActionRequest) {
    this.salesRetrieveActionRequest = salesRetrieveActionRequest;
  }


  /**
   * Get salesInstanceReport
   * @return salesInstanceReport
  **/

  public BQSalesRetrieveInputModelSalesInstanceReport getSalesInstanceReport() {
    return salesInstanceReport;
  }

  public void setSalesInstanceReport(BQSalesRetrieveInputModelSalesInstanceReport salesInstanceReport) {
    this.salesInstanceReport = salesInstanceReport;
  }


  /**
   * Get salesInstanceAnalysis
   * @return salesInstanceAnalysis
  **/

  public BQSalesRetrieveInputModelSalesInstanceAnalysis getSalesInstanceAnalysis() {
    return salesInstanceAnalysis;
  }

  public void setSalesInstanceAnalysis(BQSalesRetrieveInputModelSalesInstanceAnalysis salesInstanceAnalysis) {
    this.salesInstanceAnalysis = salesInstanceAnalysis;
  }


}

