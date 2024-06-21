package com.gov.odisha.mis.master.app.web.response;

import com.gov.odisha.mis.master.app.model.Block;
import com.gov.odisha.mis.master.app.model.District;
import lombok.Data;

import java.util.List;

@Data
public class AddressResponse {

    private String status;
    private AddressDetails addressDetails;
    private String message;



}
