package com.gov.odisha.mis.master.app.persistance.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DistrictDto {
    private int id;
    private String districtCode;
    private String districtName;
    private String stateName;
    private String createdBy;
    private long createdDate;
    private String lastModifiedBy;
    private long lastModifiedDate;
}
