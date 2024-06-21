package com.gov.odisha.mis.master.app.persistance.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gov.odisha.mis.master.app.model.Bank;

public class BankRowMapper implements RowMapper<Bank> {

	public Bank mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bank bank = new Bank();
		bank.setUuid(rs.getString("uuid"));
		bank.setCode(rs.getString("code"));
		bank.setBankName(rs.getString("bank_name"));
		bank.setActive(rs.getBoolean("is_active"));
		bank.setCreatedBy(rs.getString("created_by"));
		bank.setCreatedDate(rs.getLong("created_date"));
		bank.setLastModifiedBy(rs.getString("last_modified_by"));
		bank.setLastModifiedDate(rs.getLong("last_modified_date"));
		return bank;
	}

}
