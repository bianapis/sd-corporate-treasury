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
public class CorporateTreasuryApiServiceImpl implements CorporateTreasuryApiService {

	public CorporateTreasuryRecordResponse record(String crReferenceId, CorporateTreasuryRecordRequest request){
		return JsonReader.read("record-CorporateTreasuryRecordResponse.json",new TypeReference<CorporateTreasuryRecordResponse>(){});
	}
	
	public TreasuryPlanBaseWithId requestPost(TreasuryPlanBase request){
		return JsonReader.read("requestPost-TreasuryPlanBaseWithId.json",new TypeReference<TreasuryPlanBaseWithId>(){});
	}
	
	public TreasuryPlanBaseWithId requestPut(String crReferenceId, TreasuryPlanBase request){
		return JsonReader.read("requestPut-TreasuryPlanBaseWithId.json",new TypeReference<TreasuryPlanBaseWithId>(){});
	}
	
	public BankRatesBaseWithID retrieveBankRates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BankRatesBaseWithID.json",new TypeReference<BankRatesBaseWithID>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public TreasuryPlanBaseWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-TreasuryPlanBaseWithId.json",new TypeReference<TreasuryPlanBaseWithId>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public LiquidityBaseWithID retrieveLiquidities(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-LiquidityBaseWithID.json",new TypeReference<LiquidityBaseWithID>(){});
	}
	
	public RecordBaseWithId retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RecordBaseWithId.json",new TypeReference<RecordBaseWithId>(){});
	}
	
	public SecuritizationBaseWithID retrieveSecuritizations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-SecuritizationBaseWithID.json",new TypeReference<SecuritizationBaseWithID>(){});
	}
	
	public StrategicFundingBaseWithID retrieveStrategicFundings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-StrategicFundingBaseWithID.json",new TypeReference<StrategicFundingBaseWithID>(){});
	}
	
	public TacticalFundingBaseWithID retrieveTacticalFundings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-TacticalFundingBaseWithID.json",new TypeReference<TacticalFundingBaseWithID>(){});
	}
	
}
