package com.common.mis.master.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.mis.master.app.persistance.dao.BankMasterDao;
import com.common.mis.master.app.service.BankService;
import com.common.mis.master.app.web.request.BankRequest;
import com.common.mis.master.app.web.response.BankResponse;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankMasterDao bankDao;

	@Override
	public BankResponse getBanks(BankRequest bankRequest) {
		BankResponse response = new BankResponse();
		response.setBanks(bankDao.getBanks(bankRequest));
		return response;
	}

}
