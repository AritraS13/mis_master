package com.common.mis.master.app.persistance.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlockDto {
    private String uuid;
    private String code;
    private String districtId;
    private String blockName;
    private boolean isActive;
    private String createdBy;
    private long createdDate;
    private String lastModifiedBy;
    private long lastModifiedDate;


}
