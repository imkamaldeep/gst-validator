package com.gst.number.validator.app.component;

import org.springframework.stereotype.Component;

@Component
public class GstValidator {

    public boolean isValidGst(String gstNumber) {
        // Add your GST validation logic here
        return gstNumber.matches("\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}[A-Z\\d]{1}[Z]{1}[A-Z\\d]{1}");
    }
}