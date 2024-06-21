package com.gov.odisha.mis.master.app.service.impl;

import com.gov.odisha.mis.master.app.model.Block;
import com.gov.odisha.mis.master.app.model.District;
import com.gov.odisha.mis.master.app.model.Panchayat;
import com.gov.odisha.mis.master.app.persistance.dao.AddressDao;
import com.gov.odisha.mis.master.app.persistance.dto.BlockDto;
import com.gov.odisha.mis.master.app.persistance.dto.DistrictDto;
import com.gov.odisha.mis.master.app.persistance.dto.PanchayatDto;
import com.gov.odisha.mis.master.app.persistance.mapper.DtoModelMapper;
import com.gov.odisha.mis.master.app.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Override
    public List<District> getDistrictsByState(String stateName) {
        try {
            logger.info("Fetching districts for state: {}", stateName);
            List<DistrictDto> districtDtos = addressDao.getDistrictsByState(stateName);
            return districtDtos.stream()
                    .map(DtoModelMapper::toEntity)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error occurred while fetching districts for state: {}", stateName, e);
            throw new RuntimeException("Error occurred while fetching districts for state: " + stateName, e);
        }
    }

    @Override
    public List<Block> getBlocksByDistrict(Integer districtId) {
        try {
            logger.info("Fetching blocks for district ID: {}", districtId);
            List<BlockDto> blockDtos = addressDao.getBlocksByDistrict(districtId);
            return blockDtos.stream()
                    .map(DtoModelMapper::toEntity)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error occurred while fetching blocks for district ID: {}", districtId, e);
            throw new RuntimeException("Error occurred while fetching blocks for district ID: " + districtId, e);
        }
    }

    @Override
    public List<Panchayat> getPanchayatByBlock(String blockId) {
        try {
            logger.info("Fetching panchayats for block ID: {}", blockId);
            List<PanchayatDto> panchayatDtos = addressDao.getPanchayatByBlock(blockId);
            return panchayatDtos.stream()
                    .map(DtoModelMapper::toEntity)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            logger.error("Error occurred while fetching panchayats for block ID: {}", blockId, e);
            throw new RuntimeException("Error occurred while fetching panchayats for block ID: " + blockId, e);
        }
    }
}