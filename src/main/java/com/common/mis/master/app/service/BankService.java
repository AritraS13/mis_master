package com.common.mis.master.app.service;

import com.common.mis.master.app.web.request.BankRequest;
import com.common.mis.master.app.web.response.BankResponse;

public interface BankService {
	
	 BankResponse getBanks(BankRequest bankRequest);

}
