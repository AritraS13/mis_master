package com.common.mis.master.app.persistance.mapper;

import com.common.mis.master.app.persistance.dto.BlockDto;
import com.common.mis.master.app.persistance.dto.DistrictDto;
import com.common.mis.master.app.persistance.dto.PanchayatDto;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class AddressRowMapper {

    public RowMapper<DistrictDto> districtRowMapper() {
        return (rs, rowNum) -> {
            DistrictDto districtDto = new DistrictDto();
            districtDto.setId(rs.getInt("id"));
            districtDto.setDistrictCode(rs.getString("district_code"));
            districtDto.setDistrictName(rs.getString("district_name"));
            districtDto.setStateName(rs.getString("state_name"));
            districtDto.setCreatedBy(rs.getString("created_by"));
            districtDto.setCreatedDate(rs.getLong("created_date"));
            districtDto.setLastModifiedBy(rs.getString("last_modified_by"));
            districtDto.setLastModifiedDate(rs.getLong("last_modified_date"));
            return districtDto;
        };
    }

    public RowMapper<BlockDto> blockRowMapper() {
        return (rs, rowNum) -> {
            BlockDto blockDto = new BlockDto();
            blockDto.setUuid(rs.getString("uuid"));
            blockDto.setCode(rs.getString("code"));
            blockDto.setDistrictId(rs.getString("district_id"));
            blockDto.setBlockName(rs.getString("block_name"));
            blockDto.setActive(rs.getBoolean("is_active"));
            blockDto.setCreatedBy(rs.getString("created_by"));
            blockDto.setCreatedDate(rs.getLong("created_date"));
            blockDto.setLastModifiedBy(rs.getString("last_modified_by"));
            blockDto.setLastModifiedDate(rs.getLong("last_modified_date"));
            return blockDto;
        };
    }

    public RowMapper<PanchayatDto> panchayatRowMapper() {
        return (rs, rowNum) -> {
            PanchayatDto panchayatDto = new PanchayatDto();
            panchayatDto.setUuid(rs.getString("uuid"));
            panchayatDto.setDistrictId(rs.getString("district_id"));
            panchayatDto.setPanchayatName(rs.getString("Panchayat_name"));
            panchayatDto.setActive(rs.getBoolean("is_active"));
            panchayatDto.setCreatedBy(rs.getString("created_by"));
            panchayatDto.setCreatedDate(rs.getLong("created_date"));
            panchayatDto.setLastModifiedBy(rs.getString("last_modified_by"));
            panchayatDto.setLastModifiedDate(rs.getLong("last_modified_date"));
            panchayatDto.setPanchayatId(rs.getLong("Panchayat_id"));
            panchayatDto.setBlockId(rs.getString("block_id"));
            panchayatDto.setIsRural(rs.getString("is_rural"));
            return panchayatDto;
        };
    }
}
