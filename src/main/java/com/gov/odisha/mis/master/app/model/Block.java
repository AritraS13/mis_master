package com.gov.odisha.mis.master.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Block {
    private String uuid;
    private String code;
    private String districtId;
    private String blockName;
    private boolean isActive;
    private String createdBy;
    private long createdDate;
    private String lastModifiedBy;
    private long lastModifiedDate;

    public boolean getIsActive() {
        return isActive;
    }
}
