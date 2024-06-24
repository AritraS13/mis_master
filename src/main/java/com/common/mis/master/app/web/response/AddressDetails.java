package com.common.mis.master.app.web.response;

import lombok.Data;

import java.util.List;

import com.common.mis.master.app.model.Block;
import com.common.mis.master.app.model.District;
import com.common.mis.master.app.model.Panchayat;

@Data
public class AddressDetails {
    private String state;
    private List<District> districts;
    private List<Block> blocks;
    private List<Panchayat> pancahayat;
    private List<String> village;
    private List<String> postOffice;
    private List<String> pincode;
}
