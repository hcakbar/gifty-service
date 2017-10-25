package com.gifty.service.domain;

import com.google.common.base.MoreObjects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hcakb on 10/21/2017.
 */

@Document(collection = "profile")
public class Profile {

    @Id
    private String id;
    private String registryOwnerId;
    private Name name;
    private Address address;
    private Contact contact;

    private Profile() {

    }

    public Profile(String id, String registryOwnerId, Name name, Address address, Contact contact) {
        this.id = id;
        this.registryOwnerId = registryOwnerId;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getRegistryOwnerId() {
        return registryOwnerId;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("registryOwnerId", registryOwnerId)
                .add("name ", name)
                .add("address", address)
                .add("contact", contact)
                .toString();
    }


}
