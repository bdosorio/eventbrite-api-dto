package com.bdosorio.ebapi.dto.basic;

public class EbDateTime {

    private final String value;

    public EbDateTime(String value){
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value;
    }
}
