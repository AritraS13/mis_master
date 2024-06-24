package com.common.mis.master.app.persistance.builder;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.common.mis.master.app.persistance.dto.BlockDto;
import com.common.mis.master.app.persistance.dto.DistrictDto;
import com.common.mis.master.app.persistance.dto.PanchayatDto;
import com.common.mis.master.app.web.request.BankRequest;

@Component
public class QueryBuilder {

    public String getDistrictsByStateQuery() {
        return "SELECT * FROM District WHERE state_name = ?";
    }


    public String getBlocksByDistrictQuery() {
        return "SELECT * FROM Block WHERE district_id = ?";
    }


    public String getPanchayatByBlockQuery() {
        return "SELECT * FROM Panchayat WHERE block_id = ?";
    }


    
    public String buildGetBanksQuery(BankRequest bankRequest) {
        StringBuilder query = new StringBuilder("SELECT * FROM mis_bank_master_m WHERE 1=1");

        if (bankRequest.getUuid() != null && !bankRequest.getUuid().isEmpty()) {
            query.append(" AND uuid = '").append(bankRequest.getUuid()).append("'");
        }
        if (bankRequest.getCode() != null && !bankRequest.getCode().isEmpty()) {
            query.append(" AND code = '").append(bankRequest.getCode()).append("'");
        }

        return query.toString();
    }

}
