package com.gst.number.validator.app.response;


public class GstResponse {

    private String gstNumber;
    private String status;

    public GstResponse(String gstNumber, String status) {
        this.status = status;
        this.gstNumber = gstNumber;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
