package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLifeUpdateInputModelLifeInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQLifeUpdateOutputModel
 */
public class BQLifeUpdateOutputModel   {
  private BQLifeUpdateInputModelLifeInstanceRecord lifeInstanceRecord = null;

  private String lifeUpdateActionTaskReference = null;

  private Object lifeUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get lifeInstanceRecord
   * @return lifeInstanceRecord
  **/

  public BQLifeUpdateInputModelLifeInstanceRecord getLifeInstanceRecord() {
    return lifeInstanceRecord;
  }

  public void setLifeInstanceRecord(BQLifeUpdateInputModelLifeInstanceRecord lifeInstanceRecord) {
    this.lifeInstanceRecord = lifeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return lifeUpdateActionTaskReference
  **/

  public String getLifeUpdateActionTaskReference() {
    return lifeUpdateActionTaskReference;
  }

  public void setLifeUpdateActionTaskReference(String lifeUpdateActionTaskReference) {
    this.lifeUpdateActionTaskReference = lifeUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return lifeUpdateActionTaskRecord
  **/

  public Object getLifeUpdateActionTaskRecord() {
    return lifeUpdateActionTaskRecord;
  }

  public void setLifeUpdateActionTaskRecord(Object lifeUpdateActionTaskRecord) {
    this.lifeUpdateActionTaskRecord = lifeUpdateActionTaskRecord;
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

