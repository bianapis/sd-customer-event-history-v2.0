/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class CustomerEventHistoryApiController {

	@Autowired
	CustomerEventHistoryApiService service;
	
	@Track.Activate
	public BianResponse<SDCustomerEventHistoryActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerEventHistoryActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("fraud")
	@Track.Capture
	public BianResponse<BQFraudCaptureOutputModel> captureFraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFraudCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureFraud(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("life")
	@Track.Capture
	public BianResponse<BQLifeCaptureOutputModel> captureLife(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLifeCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureLife(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productprocessing")
	@Track.Capture
	public BianResponse<BQProductProcessingCaptureOutputModel> captureProductprocessing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductProcessingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureProductprocessing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("relationship")
	@Track.Capture
	public BianResponse<BQRelationshipCaptureOutputModel> captureRelationship(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRelationshipCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureRelationship(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Track.Capture
	public BianResponse<BQSalesCaptureOutputModel> captureSales(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureSales(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Track.Capture
	public BianResponse<BQServicingCaptureOutputModel> captureServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.Configure
	public BianResponse<SDCustomerEventHistoryConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerEventHistoryConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Control
	public BianResponse<CRCustomerEventLogControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerEventLogControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Track.Feedback
	public BianResponse<SDCustomerEventHistoryFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerEventHistoryFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Initiate
	public BianResponse<CRCustomerEventLogInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerEventLogInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Retrieve
	public BianResponse<CRCustomerEventLogRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("fraud")
	@Track.Retrieve
	public BianResponse<BQFraudRetrieveOutputModel> retrieveFraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFraud(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("life")
	@Track.Retrieve
	public BianResponse<BQLifeRetrieveOutputModel> retrieveLife(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLife(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productprocessing")
	@Track.Retrieve
	public BianResponse<BQProductProcessingRetrieveOutputModel> retrieveProductprocessing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductprocessing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("relationship")
	@Track.Retrieve
	public BianResponse<BQRelationshipRetrieveOutputModel> retrieveRelationship(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRelationship(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("sales")
	@Track.Retrieve
	public BianResponse<BQSalesRetrieveOutputModel> retrieveSales(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSales(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicing")
	@Track.Retrieve
	public BianResponse<BQServicingRetrieveOutputModel> retrieveServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Track.RetrieveSD
	public BianResponse<SDCustomerEventHistoryRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Track.Update
	public BianResponse<CRCustomerEventLogUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerEventLogUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fraud")
	@Track.Update
	public BianResponse<BQFraudUpdateOutputModel> updateFraud(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFraudUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFraud(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("life")
	@Track.Update
	public BianResponse<BQLifeUpdateOutputModel> updateLife(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLifeUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLife(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productprocessing")
	@Track.Update
	public BianResponse<BQProductProcessingUpdateOutputModel> updateProductprocessing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductProcessingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductprocessing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("relationship")
	@Track.Update
	public BianResponse<BQRelationshipUpdateOutputModel> updateRelationship(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQRelationshipUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateRelationship(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Track.Update
	public BianResponse<BQSalesUpdateOutputModel> updateSales(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSales(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicing")
	@Track.Update
	public BianResponse<BQServicingUpdateOutputModel> updateServicing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServicingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
