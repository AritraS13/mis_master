package com.gov.odisha.mis.master.app.web.request;

import com.gov.odisha.mis.master.app.model.Block;
import com.gov.odisha.mis.master.app.model.District;
import com.gov.odisha.mis.master.app.model.Panchayat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {

    private String state;
    private Integer districtId;
    private String blockId;
    private Panchayat pancahayat;
    private String village;
    private String pincode;
    private String postOffice;
}
