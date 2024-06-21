package com.gov.odisha.mis.master.app.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Panchayat {
    private String uuid;
    private String districtId;
    private String panchayatName;
    private boolean isActive;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private long panchayatId;
    private String blockId;
    private String isRural;

}
