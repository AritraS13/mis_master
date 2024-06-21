package com.gov.odisha.mis.master.app.persistance.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PanchayatDto {
    private String uuid;
    private String districtId;
    private String panchayatName;
    private boolean isActive;
    private String createdBy;
    private long createdDate;
    private String lastModifiedBy;
    private long lastModifiedDate;
    private long panchayatId;
    private String blockId;
    private String isRural;

}
