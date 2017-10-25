package com.gifty.service.domain;

import com.google.common.base.MoreObjects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hcakb on 10/21/2017.
 */

@Document(collection = "name")
public class Name {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private boolean isRegistryEventOwner;

    private Name() {

    }

    public Name(String id, String firstName, String lastName, String middleName, boolean isRegistryEventOwner) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.isRegistryEventOwner = isRegistryEventOwner;
    }


    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public boolean isRegistryEventOwner() {
        return isRegistryEventOwner;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("middleName", middleName)
                .add("isRegistryEventOwner", isRegistryEventOwner)
                .toString();
    }


}
