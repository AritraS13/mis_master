package com.gov.odisha.mis.master.app.persistance.dao;

import java.util.List;

import com.gov.odisha.mis.master.app.model.Bank;
import com.gov.odisha.mis.master.app.web.request.BankRequest;

public interface BankMasterDao {
	
	List<Bank> getBanks(BankRequest bankRequest);

}
