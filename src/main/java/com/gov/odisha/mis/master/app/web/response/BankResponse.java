package com.gov.odisha.mis.master.app.web.response;

import java.util.List;

import com.gov.odisha.mis.master.app.model.Bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BankResponse {

	private List<Bank> banks;

}
