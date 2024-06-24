package com.common.mis.master.app.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.common.mis.master.app.model.Block;
import com.common.mis.master.app.model.District;
import com.common.mis.master.app.model.Panchayat;
import com.common.mis.master.app.service.AddressService;
import com.common.mis.master.app.web.request.AddressRequest;
import com.common.mis.master.app.web.response.AddressDetails;
import com.common.mis.master.app.web.response.AddressResponse;

import java.util.List;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);


    @PostMapping
    public ResponseEntity<AddressResponse> getAddressResp(@RequestBody AddressRequest request) {
        AddressResponse response = new AddressResponse();
        try {
            AddressDetails addressDetails = new AddressDetails();

            if(request!=null) {
                if(request.getState()==null || request.getState().isEmpty()){
                    request.setState("odisha");
                }
                if (request.getState() != null && !request.getState().isEmpty()) {
                    List<District> districts = addressService.getDistrictsByState(request.getState());
                    addressDetails.setDistricts(districts);
                }

                if (request.getDistrict() != null) {
                    List<Block> blocks = addressService.getBlocksByDistrict(request.getDistrict().getId());
                    addressDetails.setBlocks(blocks);
                }
                if(request.getBlock()!=null){
                    List<Panchayat> panchayats = addressService.getPanchayatByBlock(request.getBlock().getUuid());
                    addressDetails.setPancahayat(panchayats);
                }

                // Add similar checks for village, postOffice, and pincode
                addressDetails.setState(request.getState());
                response.setAddressDetails(addressDetails);
                response.setStatus("Success");
            }
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            logger.error("Error occurred while processing address request", e);
            response.setStatus("Failure");
            response.setMessage("An error occurred while processing your request. Please try again later.");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }


    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}
