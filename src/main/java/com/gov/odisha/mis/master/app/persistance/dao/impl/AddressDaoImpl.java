package com.gov.odisha.mis.master.app.persistance.dao.impl;

import com.gov.odisha.mis.master.app.persistance.builder.QueryBuilder;
import com.gov.odisha.mis.master.app.persistance.dao.AddressDao;
import com.gov.odisha.mis.master.app.persistance.dto.BlockDto;
import com.gov.odisha.mis.master.app.persistance.dto.DistrictDto;
import com.gov.odisha.mis.master.app.persistance.dto.PanchayatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private QueryBuilder queryBuilder;

    @Override
    public List<DistrictDto> getDistrictsByState(String stateName) {
        List<Object> preparedStatementValues = new ArrayList<>();
        String SQL = queryBuilder.getDistrictsByStateQuery();
        preparedStatementValues.add(stateName);

        RowMapper<DistrictDto> rowMapper = queryBuilder.districtRowMapper();

        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
    }

    @Override
    public List<BlockDto> getBlocksByDistrict(Integer districtId) {
        List<Object> preparedStatementValues = new ArrayList<>();
        String SQL = queryBuilder.getBlocksByDistrictQuery();
        preparedStatementValues.add(districtId);

        RowMapper<BlockDto> rowMapper = queryBuilder.blockRowMapper();

        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
    }

//    @Override
//    public List<PanchayatDto> getPanchayatByBlock(String blockId) {
//        List<Object> preparedStatementValues = new ArrayList<>();
//        String SQL = queryBuilder.getPanchayatByBlockQuery();
//        preparedStatementValues.add(blockId);
//
//        RowMapper<PanchayatDto> rowMapper = queryBuilder.panchayatRowMapper();
//
//        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
//    }


    @Override
    public List<PanchayatDto> getPanchayatByBlock(String blockId) {
        List<Object> preparedStatementValues = new ArrayList<>();
        String SQL = queryBuilder.getPanchayatByBlockQuery();
        preparedStatementValues.add(blockId);

        RowMapper<PanchayatDto> rowMapper = queryBuilder.panchayatRowMapper();

        return jdbcTemplate.query(SQL, preparedStatementValues.toArray(), rowMapper);
    }
}