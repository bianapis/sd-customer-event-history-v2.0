package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServicingUpdateInputModelServicingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQServicingUpdateOutputModel
 */
public class BQServicingUpdateOutputModel   {
  private BQServicingUpdateInputModelServicingInstanceRecord servicingInstanceRecord = null;

  private String servicingUpdateActionTaskReference = null;

  private Object servicingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get servicingInstanceRecord
   * @return servicingInstanceRecord
  **/

  public BQServicingUpdateInputModelServicingInstanceRecord getServicingInstanceRecord() {
    return servicingInstanceRecord;
  }

  public void setServicingInstanceRecord(BQServicingUpdateInputModelServicingInstanceRecord servicingInstanceRecord) {
    this.servicingInstanceRecord = servicingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return servicingUpdateActionTaskReference
  **/

  public String getServicingUpdateActionTaskReference() {
    return servicingUpdateActionTaskReference;
  }

  public void setServicingUpdateActionTaskReference(String servicingUpdateActionTaskReference) {
    this.servicingUpdateActionTaskReference = servicingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return servicingUpdateActionTaskRecord
  **/

  public Object getServicingUpdateActionTaskRecord() {
    return servicingUpdateActionTaskRecord;
  }

  public void setServicingUpdateActionTaskRecord(Object servicingUpdateActionTaskRecord) {
    this.servicingUpdateActionTaskRecord = servicingUpdateActionTaskRecord;
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

