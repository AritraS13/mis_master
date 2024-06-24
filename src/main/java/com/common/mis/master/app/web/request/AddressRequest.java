package com.common.mis.master.app.web.request;

import com.common.mis.master.app.model.Block;
import com.common.mis.master.app.model.District;
import com.common.mis.master.app.model.Panchayat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {

    private String state;
    private District district;
    private Block block;
    private Panchayat pancahayat;
    private String village;
    private String pincode;
    private String postOffice;
}
