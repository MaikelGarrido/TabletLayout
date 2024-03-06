package com.example.tablelayout;

public class Country {
    private String sISOCode;
    private String sName;

    public Country(String sISOCode, String sName) {
        this.sISOCode = sISOCode;
        this.sName = sName;
    }

    public String getsISOCode() {
        return sISOCode;
    }

    public void setsISOCode(String sISOCode) {
        this.sISOCode = sISOCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}

