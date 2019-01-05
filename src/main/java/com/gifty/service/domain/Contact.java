package com.gifty.service.domain;

import com.google.common.base.MoreObjects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hcakb on 10/11/2017.
 */

@Document(collection = "contact")
public class Contact {

    @Id
    private String id;
    private String emailAddress;
    private String phoneNumber;

    private Contact() {

    }

    public Contact(String id, String emailAddress, String phoneNumber) {
        this.id = id;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("emailAddress", emailAddress)
                .add("phoneNumber", phoneNumber)
                .toString();
    }


}
