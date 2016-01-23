package com.bdosorio.ebapi.dto.event;

import java.util.List;

public class EbCategory {
    private String name;
    private String name_localized;
    private String short_name;
    private List<EbSubcategory> subcategories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_localized() {
        return name_localized;
    }

    public void setName_localized(String name_localized) {
        this.name_localized = name_localized;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public List<EbSubcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<EbSubcategory> subcategories) {
        this.subcategories = subcategories;
    }
}
