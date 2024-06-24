package com.common.mis.master.app.model;

import lombok.Data;

@Data
public class District {
    private int id;
    private String districtCode;
    private String districtName;
    private String stateName;
    private String createdBy;
    private long createdDate;
    private String lastModifiedBy;
    private long lastModifiedDate;

}
