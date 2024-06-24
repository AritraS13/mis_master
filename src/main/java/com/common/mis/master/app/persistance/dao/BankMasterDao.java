package com.common.mis.master.app.persistance.dao;

import java.util.List;

import com.common.mis.master.app.model.Bank;
import com.common.mis.master.app.web.request.BankRequest;

public interface BankMasterDao {
	
	List<Bank> getBanks(BankRequest bankRequest);

}
