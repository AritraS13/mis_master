package com.gov.odisha.mis.master.app.web.response;

import com.gov.odisha.mis.master.app.model.Block;
import com.gov.odisha.mis.master.app.model.District;
import com.gov.odisha.mis.master.app.model.Panchayat;
import lombok.Data;

import java.util.List;

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
