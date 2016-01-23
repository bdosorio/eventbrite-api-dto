package com.bdosorio.ebapi.dto.basic;

public class EbDate {

    private final String value;

    public EbDate(String value){
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
