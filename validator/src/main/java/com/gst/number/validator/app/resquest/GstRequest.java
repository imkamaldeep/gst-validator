package com.gst.number.validator.app.resquest;

import jakarta.validation.constraints.Pattern;

public class GstRequest {

  //  @Pattern(regexp = "\\d{2}[A-Z]{5}\\d{4}[A-Z]{1}[A-Z\\d]{1}[Z]{1}[A-Z\\d]{1}", message = "Invalid GST number format")
    private String gstNumber;

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }
}
