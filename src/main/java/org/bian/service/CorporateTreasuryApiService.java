/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateTreasuryApiService {

	CorporateTreasuryRecordResponse record(String crReferenceId, CorporateTreasuryRecordRequest request);
	
	TreasuryPlanBaseWithId requestPost(TreasuryPlanBase request);
	
	TreasuryPlanBaseWithId requestPut(String crReferenceId, TreasuryPlanBase request);
	
	BankRatesBaseWithID retrieveBankRates(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	TreasuryPlanBaseWithId retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	LiquidityBaseWithID retrieveLiquidities(String crReferenceId, String bqReferenceId);
	
	RecordBaseWithId retrieveRecords(String crReferenceId, String bqReferenceId);
	
	SecuritizationBaseWithID retrieveSecuritizations(String crReferenceId, String bqReferenceId);
	
	StrategicFundingBaseWithID retrieveStrategicFundings(String crReferenceId, String bqReferenceId);
	
	TacticalFundingBaseWithID retrieveTacticalFundings(String crReferenceId, String bqReferenceId);
	
}
