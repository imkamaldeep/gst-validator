package com.gst.number.validator.app.service;


import com.gst.number.validator.app.component.GstValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstValidationService {

    @Autowired
    private GstValidator gstValidator;

    public boolean isValidGst(String gstNumber) {
        return gstValidator.isValidGst(gstNumber);
    }
}
