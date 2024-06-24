package com.common.mis.master.app.web.response;

import lombok.Data;

import java.util.List;

import com.common.mis.master.app.model.Block;
import com.common.mis.master.app.model.District;

@Data
public class AddressResponse {

    private String status;
    private AddressDetails addressDetails;
    private String message;



}
