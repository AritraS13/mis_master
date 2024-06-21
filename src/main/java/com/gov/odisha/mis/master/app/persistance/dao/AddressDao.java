package com.gov.odisha.mis.master.app.persistance.dao;

import com.gov.odisha.mis.master.app.persistance.dto.BlockDto;
import com.gov.odisha.mis.master.app.persistance.dto.DistrictDto;
import com.gov.odisha.mis.master.app.persistance.dto.PanchayatDto;

import java.util.List;

public interface AddressDao {
    List<DistrictDto> getDistrictsByState(String stateName);

    List<BlockDto> getBlocksByDistrict(Integer districtId);
    List<PanchayatDto> getPanchayatByBlock(String blockId);
}
