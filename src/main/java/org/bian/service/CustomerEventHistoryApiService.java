/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerEventHistoryApiService {

	SDCustomerEventHistoryActivateOutputModel activate(SDCustomerEventHistoryActivateInputModel request);
	
	BQFraudCaptureOutputModel captureFraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFraudCaptureInputModel request);
	
	BQLifeCaptureOutputModel captureLife(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLifeCaptureInputModel request);
	
	BQProductProcessingCaptureOutputModel captureProductprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductProcessingCaptureInputModel request);
	
	BQRelationshipCaptureOutputModel captureRelationship(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRelationshipCaptureInputModel request);
	
	BQSalesCaptureOutputModel captureSales(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesCaptureInputModel request);
	
	BQServicingCaptureOutputModel captureServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingCaptureInputModel request);
	
	SDCustomerEventHistoryConfigureOutputModel configure(String sdReferenceId, SDCustomerEventHistoryConfigureInputModel request);
	
	CRCustomerEventLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerEventLogControlInputModel request);
	
	SDCustomerEventHistoryFeedbackOutputModel feedback(String sdReferenceId, SDCustomerEventHistoryFeedbackInputModel request);
	
	CRCustomerEventLogInitiateOutputModel initiate(String sdReferenceId, CRCustomerEventLogInitiateInputModel request);
	
	CRCustomerEventLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQFraudRetrieveOutputModel retrieveFraud(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQLifeRetrieveOutputModel retrieveLife(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductProcessingRetrieveOutputModel retrieveProductprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRelationshipRetrieveOutputModel retrieveRelationship(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSalesRetrieveOutputModel retrieveSales(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServicingRetrieveOutputModel retrieveServicing(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDCustomerEventHistoryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerEventLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerEventLogUpdateInputModel request);
	
	BQFraudUpdateOutputModel updateFraud(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFraudUpdateInputModel request);
	
	BQLifeUpdateOutputModel updateLife(String sdReferenceId, String crReferenceId, String bqReferenceId, BQLifeUpdateInputModel request);
	
	BQProductProcessingUpdateOutputModel updateProductprocessing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductProcessingUpdateInputModel request);
	
	BQRelationshipUpdateOutputModel updateRelationship(String sdReferenceId, String crReferenceId, String bqReferenceId, BQRelationshipUpdateInputModel request);
	
	BQSalesUpdateOutputModel updateSales(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesUpdateInputModel request);
	
	BQServicingUpdateOutputModel updateServicing(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServicingUpdateInputModel request);
	
}
