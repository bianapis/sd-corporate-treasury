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
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class CorporateTreasuryApiController {

	@Autowired
	CorporateTreasuryApiService service;
	
	@Manage.Record
	public BianResponse<CorporateTreasuryRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorporateTreasuryRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Manage.RequestPost
	public BianResponse<TreasuryPlanBaseWithId> requestPost(@RequestBody BianRequest<TreasuryPlanBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Manage.RequestPut
	public BianResponse<TreasuryPlanBaseWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<TreasuryPlanBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("bank-rates")
	@Manage.Retrieve
	public BianResponse<BankRatesBaseWithID> retrieveBankRates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveBankRates(crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.Retrieve
	public BianResponse<TreasuryPlanBaseWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("liquidities")
	@Manage.Retrieve
	public BianResponse<LiquidityBaseWithID> retrieveLiquidities(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLiquidities(crReferenceId, bqReferenceId));
	}
	
	@BQ("records")
	@Manage.Retrieve
	public BianResponse<RecordBaseWithId> retrieveRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRecords(crReferenceId, bqReferenceId));
	}
	
	@BQ("securitizations")
	@Manage.Retrieve
	public BianResponse<SecuritizationBaseWithID> retrieveSecuritizations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSecuritizations(crReferenceId, bqReferenceId));
	}
	
	@BQ("strategic-fundings")
	@Manage.Retrieve
	public BianResponse<StrategicFundingBaseWithID> retrieveStrategicFundings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStrategicFundings(crReferenceId, bqReferenceId));
	}
	
	@BQ("tactical-fundings")
	@Manage.Retrieve
	public BianResponse<TacticalFundingBaseWithID> retrieveTacticalFundings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTacticalFundings(crReferenceId, bqReferenceId));
	}
	
}
