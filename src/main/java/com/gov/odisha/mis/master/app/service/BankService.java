package com.gov.odisha.mis.master.app.service;

import com.gov.odisha.mis.master.app.web.request.BankRequest;
import com.gov.odisha.mis.master.app.web.response.BankResponse;

public interface BankService {
	
	 BankResponse getBanks(BankRequest bankRequest);

}
