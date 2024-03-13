package com.example.tablelayout;

public class Country {
    private String sISOCode;
    private String sName;

    private Boolean isSelected;

    public Country(String sISOCode, String sName) {
        this.sISOCode = sISOCode;
        this.sName = sName;
        this.isSelected = false;
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

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}

