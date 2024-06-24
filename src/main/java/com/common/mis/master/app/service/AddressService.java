package com.common.mis.master.app.service;

import java.util.List;

import com.common.mis.master.app.model.Block;
import com.common.mis.master.app.model.District;
import com.common.mis.master.app.model.Panchayat;

public interface AddressService {
    public List<District> getDistrictsByState(String stateName);

    public List<Block> getBlocksByDistrict(Integer districtId);
    public List<Panchayat> getPanchayatByBlock(String blockId);
}
