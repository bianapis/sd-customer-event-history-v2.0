package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQFraudUpdateInputModelFraudInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQFraudUpdateOutputModel
 */
public class BQFraudUpdateOutputModel   {
  private BQFraudUpdateInputModelFraudInstanceRecord fraudInstanceRecord = null;

  private String fraudUpdateActionTaskReference = null;

  private Object fraudUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get fraudInstanceRecord
   * @return fraudInstanceRecord
  **/

  public BQFraudUpdateInputModelFraudInstanceRecord getFraudInstanceRecord() {
    return fraudInstanceRecord;
  }

  public void setFraudInstanceRecord(BQFraudUpdateInputModelFraudInstanceRecord fraudInstanceRecord) {
    this.fraudInstanceRecord = fraudInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return fraudUpdateActionTaskReference
  **/

  public String getFraudUpdateActionTaskReference() {
    return fraudUpdateActionTaskReference;
  }

  public void setFraudUpdateActionTaskReference(String fraudUpdateActionTaskReference) {
    this.fraudUpdateActionTaskReference = fraudUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fraudUpdateActionTaskRecord
  **/

  public Object getFraudUpdateActionTaskRecord() {
    return fraudUpdateActionTaskRecord;
  }

  public void setFraudUpdateActionTaskRecord(Object fraudUpdateActionTaskRecord) {
    this.fraudUpdateActionTaskRecord = fraudUpdateActionTaskRecord;
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

