package com.gov.odisha.mis.master.app.service;

import com.gov.odisha.mis.master.app.model.Block;
import com.gov.odisha.mis.master.app.model.District;
import com.gov.odisha.mis.master.app.model.Panchayat;

import java.util.List;

public interface AddressService {
    public List<District> getDistrictsByState(String stateName);

    public List<Block> getBlocksByDistrict(Integer districtId);
    public List<Panchayat> getPanchayatByBlock(String blockId);
}
