package com.gov.odisha.mis.master.app.persistance.mapper;

import com.gov.odisha.mis.master.app.model.Block;
import com.gov.odisha.mis.master.app.model.District;
import com.gov.odisha.mis.master.app.model.Panchayat;
import com.gov.odisha.mis.master.app.persistance.dto.BlockDto;
import com.gov.odisha.mis.master.app.persistance.dto.DistrictDto;
import com.gov.odisha.mis.master.app.persistance.dto.PanchayatDto;

import java.util.Date;

public class DtoModelMapper {

    public static DistrictDto toDto(District district) {
        return DistrictDto.builder()
                .id(district.getId())
                .districtCode(district.getDistrictCode())
                .districtName(district.getDistrictName())
                .stateName(district.getStateName())
                .createdBy(district.getCreatedBy())
                .createdDate(district.getCreatedDate())
                .lastModifiedBy(district.getLastModifiedBy())
                .lastModifiedDate(district.getLastModifiedDate())
                .build();
    }

    public static District toEntity(DistrictDto districtDto) {
        District district = new District();
        district.setId(districtDto.getId());
        district.setDistrictCode(districtDto.getDistrictCode());
        district.setDistrictName(districtDto.getDistrictName());
        district.setStateName(districtDto.getStateName());
        district.setCreatedBy(districtDto.getCreatedBy());
        district.setCreatedDate(districtDto.getCreatedDate());
        district.setLastModifiedBy(districtDto.getLastModifiedBy());
        district.setLastModifiedDate(districtDto.getLastModifiedDate());
        return district;
    }

    public static BlockDto toDto(Block block) {
        return BlockDto.builder()
                .uuid(block.getUuid())
                .code(block.getCode())
                .districtId(block.getDistrictId())
                .blockName(block.getBlockName())
                .isActive(block.getIsActive())
                .createdBy(block.getCreatedBy())
                .createdDate(block.getCreatedDate())
                .lastModifiedBy(block.getLastModifiedBy())
                .lastModifiedDate(block.getLastModifiedDate())
                .build();
    }

    public static Block toEntity(BlockDto blockDto) {
        Block block = new Block();
        block.setUuid(blockDto.getUuid());
        block.setCode(blockDto.getCode());
        block.setDistrictId(blockDto.getDistrictId());
        block.setBlockName(blockDto.getBlockName());
        block.setActive(blockDto.isActive());
        block.setCreatedBy(blockDto.getCreatedBy());
        block.setCreatedDate(blockDto.getCreatedDate());
        block.setLastModifiedBy(blockDto.getLastModifiedBy());
        block.setLastModifiedDate(blockDto.getLastModifiedDate());
        return block;
    }

    public static PanchayatDto toDto(Panchayat panchayat) {
        PanchayatDto dto = new PanchayatDto();
        dto.setUuid(panchayat.getUuid());
        dto.setDistrictId(panchayat.getDistrictId());
        dto.setPanchayatName(panchayat.getPanchayatName());
        dto.setActive(panchayat.isActive());
        dto.setCreatedBy(panchayat.getCreatedBy());
        dto.setCreatedDate(panchayat.getCreatedDate().getTime());
        dto.setLastModifiedBy(panchayat.getLastModifiedBy());
        dto.setLastModifiedDate(panchayat.getLastModifiedDate() != null ? panchayat.getLastModifiedDate().getTime() : null);
        dto.setPanchayatId(panchayat.getPanchayatId());
//        dto.setBlockId(panchayat.getBlockId());
        dto.setIsRural(panchayat.getIsRural());
        return dto;
    }

    public static Panchayat toEntity(PanchayatDto dto) {
        Panchayat panchayat = new Panchayat();
        panchayat.setUuid(dto.getUuid());
        panchayat.setDistrictId(dto.getDistrictId());
        panchayat.setPanchayatName(dto.getPanchayatName());
        panchayat.setActive(dto.isActive());
        panchayat.setCreatedBy(dto.getCreatedBy());
        panchayat.setCreatedDate(new Date(dto.getCreatedDate()));
        panchayat.setLastModifiedBy(dto.getLastModifiedBy());
        panchayat.setLastModifiedDate(new Date(dto.getLastModifiedDate()));
        panchayat.setPanchayatId(dto.getPanchayatId());
        panchayat.setBlockId(dto.getBlockId());
        panchayat.setIsRural(dto.getIsRural());
        return panchayat;
    }
}
