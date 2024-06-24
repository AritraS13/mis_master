package com.common.mis.master.app.persistance.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.common.mis.master.app.model.Bank;
import com.common.mis.master.app.persistance.builder.QueryBuilder;
import com.common.mis.master.app.persistance.dao.BankMasterDao;
import com.common.mis.master.app.persistance.mapper.BankRowMapper;
import com.common.mis.master.app.web.request.BankRequest;

@Repository
public class BankMasterDaoImpl implements BankMasterDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private QueryBuilder queryBuilder;

	@Override
	public List<Bank> getBanks(BankRequest bankRequest) {
		String query = queryBuilder.buildGetBanksQuery(bankRequest);
		return jdbcTemplate.query(query, new BankRowMapper());
	}

}
