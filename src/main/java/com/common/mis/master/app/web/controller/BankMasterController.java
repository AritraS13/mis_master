package com.common.mis.master.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.mis.master.app.service.BankService;
import com.common.mis.master.app.web.request.BankRequest;
import com.common.mis.master.app.web.response.BankResponse;

@RestController
@RequestMapping("/banks")
public class BankMasterController {

	@Autowired
	private BankService bankService;

	@PostMapping("/getBankMasterDetails")
	public BankResponse getAllBanks(@ModelAttribute BankRequest bankRequest) {
		return bankService.getBanks(bankRequest);
	}

}
