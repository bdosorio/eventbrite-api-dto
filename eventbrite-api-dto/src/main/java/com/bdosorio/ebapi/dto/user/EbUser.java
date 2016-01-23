package com.bdosorio.ebapi.dto.user;

import com.bdosorio.ebapi.dto.basic.EbObject;
import com.bdosorio.ebapi.dto.user.EbUserEmail;

import java.util.List;

public class EbUser extends EbObject {

   private String name;
   private String first_name;
   private String last_name;
   private List<EbUserEmail> emails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<EbUserEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<EbUserEmail> emails) {
        this.emails = emails;
    }
}
