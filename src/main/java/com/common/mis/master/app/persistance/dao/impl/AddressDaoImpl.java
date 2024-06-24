package com.common.mis.master.app.persistance.dao.impl;

import com.common.mis.master.app.persistance.mapper.AddressRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.common.mis.master.app.persistance.builder.QueryBuilder;
import com.common.mis.master.app.persistance.dao.AddressDao;
import com.common.mis.master.app.persistance.dto.BlockDto;
import com.common.mis.master.app.persistance.dto.DistrictDto;
import com.common.mis.master.app.persistance.dto.PanchayatDto;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private QueryBuilder queryBuilder;

    @Autowired
    AddressRowMapper addressRowMapper;

    @Override
    public List<DistrictDto> getDistrictsByState(String stateName) {
        List<Object> preparedStatementValues = new ArrayList<>();
        String SQL = queryBuilder.getDistrictsByStateQuery();
        preparedStatementValues.add(stateName);

        RowMapper<DistrictDto> rowMapper = addressRowMapper.districtRowMapper();

        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
    }

    @Override
    public List<BlockDto> getBlocksByDistrict(Integer districtId) {
        List<Object> preparedStatementValues = new ArrayList<>();
        String SQL = queryBuilder.getBlocksByDistrictQuery();
        preparedStatementValues.add(districtId);

        RowMapper<BlockDto> rowMapper = addressRowMapper.blockRowMapper();

        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
    }


    @Override
    public List<PanchayatDto> getPanchayatByBlock(String blockId) {
        List<Object> preparedStatementValues = new ArrayList<>();
        String SQL = queryBuilder.getPanchayatByBlockQuery();
        preparedStatementValues.add(blockId);

        RowMapper<PanchayatDto> rowMapper = addressRowMapper.panchayatRowMapper();

        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
    }
}