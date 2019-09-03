package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesUpdateInputModelSalesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesUpdateOutputModel
 */
public class BQSalesUpdateOutputModel   {
  private BQSalesUpdateInputModelSalesInstanceRecord salesInstanceRecord = null;

  private String salesUpdateActionTaskReference = null;

  private Object salesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get salesInstanceRecord
   * @return salesInstanceRecord
  **/

  public BQSalesUpdateInputModelSalesInstanceRecord getSalesInstanceRecord() {
    return salesInstanceRecord;
  }

  public void setSalesInstanceRecord(BQSalesUpdateInputModelSalesInstanceRecord salesInstanceRecord) {
    this.salesInstanceRecord = salesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return salesUpdateActionTaskReference
  **/

  public String getSalesUpdateActionTaskReference() {
    return salesUpdateActionTaskReference;
  }

  public void setSalesUpdateActionTaskReference(String salesUpdateActionTaskReference) {
    this.salesUpdateActionTaskReference = salesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return salesUpdateActionTaskRecord
  **/

  public Object getSalesUpdateActionTaskRecord() {
    return salesUpdateActionTaskRecord;
  }

  public void setSalesUpdateActionTaskRecord(Object salesUpdateActionTaskRecord) {
    this.salesUpdateActionTaskRecord = salesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

