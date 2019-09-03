/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerEventHistoryApiServiceImpl implements CustomerEventHistoryApiService {

	public SDCustomerEventHistoryActivateOutputModel activate(SDCustomerEventHistoryActivateInputModel request){
		return JsonReader.read("activate-SDCustomerEventHistoryActivateOutputModel.json",new TypeReference<SDCustomerEventHistoryActivateOutputModel>(){});
	}
	
	public BQFraudCaptureOutputModel captureFraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFraudCaptureInputModel request){
		return JsonReader.read("capture-BQFraudCaptureOutputModel.json",new TypeReference<BQFraudCaptureOutputModel>(){});
	}
	
	public BQLifeCaptureOutputModel captureLife(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLifeCaptureInputModel request){
		return JsonReader.read("capture-BQLifeCaptureOutputModel.json",new TypeReference<BQLifeCaptureOutputModel>(){});
	}
	
	public BQProductProcessingCaptureOutputModel captureProductprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductProcessingCaptureInputModel request){
		return JsonReader.read("capture-BQProductProcessingCaptureOutputModel.json",new TypeReference<BQProductProcessingCaptureOutputModel>(){});
	}
	
	public BQRelationshipCaptureOutputModel captureRelationship(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRelationshipCaptureInputModel request){
		return JsonReader.read("capture-BQRelationshipCaptureOutputModel.json",new TypeReference<BQRelationshipCaptureOutputModel>(){});
	}
	
	public BQSalesCaptureOutputModel captureSales(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesCaptureInputModel request){
		return JsonReader.read("capture-BQSalesCaptureOutputModel.json",new TypeReference<BQSalesCaptureOutputModel>(){});
	}
	
	public BQServicingCaptureOutputModel captureServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingCaptureInputModel request){
		return JsonReader.read("capture-BQServicingCaptureOutputModel.json",new TypeReference<BQServicingCaptureOutputModel>(){});
	}
	
	public SDCustomerEventHistoryConfigureOutputModel configure(String sdReferenceId, SDCustomerEventHistoryConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerEventHistoryConfigureOutputModel.json",new TypeReference<SDCustomerEventHistoryConfigureOutputModel>(){});
	}
	
	public CRCustomerEventLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerEventLogControlInputModel request){
		return JsonReader.read("control-CRCustomerEventLogControlOutputModel.json",new TypeReference<CRCustomerEventLogControlOutputModel>(){});
	}
	
	public SDCustomerEventHistoryFeedbackOutputModel feedback(String sdReferenceId, SDCustomerEventHistoryFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerEventHistoryFeedbackOutputModel.json",new TypeReference<SDCustomerEventHistoryFeedbackOutputModel>(){});
	}
	
	public CRCustomerEventLogInitiateOutputModel initiate(String sdReferenceId, CRCustomerEventLogInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerEventLogInitiateOutputModel.json",new TypeReference<CRCustomerEventLogInitiateOutputModel>(){});
	}
	
	public CRCustomerEventLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerEventLogRetrieveOutputModel.json",new TypeReference<CRCustomerEventLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQFraudRetrieveOutputModel retrieveFraud(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFraudRetrieveOutputModel.json",new TypeReference<BQFraudRetrieveOutputModel>(){});
	}
	
	public BQLifeRetrieveOutputModel retrieveLife(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQLifeRetrieveOutputModel.json",new TypeReference<BQLifeRetrieveOutputModel>(){});
	}
	
	public BQProductProcessingRetrieveOutputModel retrieveProductprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductProcessingRetrieveOutputModel.json",new TypeReference<BQProductProcessingRetrieveOutputModel>(){});
	}
	
	public BQRelationshipRetrieveOutputModel retrieveRelationship(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRelationshipRetrieveOutputModel.json",new TypeReference<BQRelationshipRetrieveOutputModel>(){});
	}
	
	public BQSalesRetrieveOutputModel retrieveSales(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSalesRetrieveOutputModel.json",new TypeReference<BQSalesRetrieveOutputModel>(){});
	}
	
	public BQServicingRetrieveOutputModel retrieveServicing(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQServicingRetrieveOutputModel.json",new TypeReference<BQServicingRetrieveOutputModel>(){});
	}
	
	public SDCustomerEventHistoryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerEventHistoryRetrieveOutputModel.json",new TypeReference<SDCustomerEventHistoryRetrieveOutputModel>(){});
	}
	
	public CRCustomerEventLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerEventLogUpdateInputModel request){
		return JsonReader.read("update-CRCustomerEventLogUpdateOutputModel.json",new TypeReference<CRCustomerEventLogUpdateOutputModel>(){});
	}
	
	public BQFraudUpdateOutputModel updateFraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFraudUpdateInputModel request){
		return JsonReader.read("update-BQFraudUpdateOutputModel.json",new TypeReference<BQFraudUpdateOutputModel>(){});
	}
	
	public BQLifeUpdateOutputModel updateLife(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLifeUpdateInputModel request){
		return JsonReader.read("update-BQLifeUpdateOutputModel.json",new TypeReference<BQLifeUpdateOutputModel>(){});
	}
	
	public BQProductProcessingUpdateOutputModel updateProductprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductProcessingUpdateInputModel request){
		return JsonReader.read("update-BQProductProcessingUpdateOutputModel.json",new TypeReference<BQProductProcessingUpdateOutputModel>(){});
	}
	
	public BQRelationshipUpdateOutputModel updateRelationship(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRelationshipUpdateInputModel request){
		return JsonReader.read("update-BQRelationshipUpdateOutputModel.json",new TypeReference<BQRelationshipUpdateOutputModel>(){});
	}
	
	public BQSalesUpdateOutputModel updateSales(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesUpdateInputModel request){
		return JsonReader.read("update-BQSalesUpdateOutputModel.json",new TypeReference<BQSalesUpdateOutputModel>(){});
	}
	
	public BQServicingUpdateOutputModel updateServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingUpdateInputModel request){
		return JsonReader.read("update-BQServicingUpdateOutputModel.json",new TypeReference<BQServicingUpdateOutputModel>(){});
	}
	
}
