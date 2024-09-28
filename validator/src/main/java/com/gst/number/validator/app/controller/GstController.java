package com.gst.number.validator.app.controller;


import com.gst.number.validator.app.service.GstValidationService;
import com.gst.number.validator.app.response.GstResponse;
import com.gst.number.validator.app.resquest.GstRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gst")
public class GstController {

    @Autowired
    private GstValidationService gstValidationService;

    @PostMapping("/validate")
    public ResponseEntity<GstResponse> validateGst(@Valid @RequestBody GstRequest gstRequest) {
        boolean isValid = gstValidationService.isValidGst(gstRequest.getGstNumber());
        GstResponse response = new GstResponse(gstRequest.getGstNumber(), isValid ? "valid" : "invalid");
        return ResponseEntity.ok(response);
    }

}
