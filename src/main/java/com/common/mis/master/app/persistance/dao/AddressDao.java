package com.common.mis.master.app.persistance.dao;

import java.util.List;

import com.common.mis.master.app.persistance.dto.BlockDto;
import com.common.mis.master.app.persistance.dto.DistrictDto;
import com.common.mis.master.app.persistance.dto.PanchayatDto;

public interface AddressDao {
    List<DistrictDto> getDistrictsByState(String stateName);

    List<BlockDto> getBlocksByDistrict(Integer districtId);
    List<PanchayatDto> getPanchayatByBlock(String blockId);
}
