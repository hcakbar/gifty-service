package com.gifty.service.domain;

import com.google.common.base.MoreObjects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hcakb on 10/11/2017.
 */

@Document(collection = "address")
public class Address {

    @Id
    private String id;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressCity;
    private String addressState;
    private String addressPostal;
    private String addressCountry;

    private Address() {

    }

    public Address(String id, String addressLineOne, String addressLineTwo, String addressCity, String addressState, String addressPostal, String addressCountry) {
        this.id = id;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressPostal = addressPostal;
        this.addressCountry = addressCountry;
    }

    public String getId() {
        return id;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public String getAddressPostal() {
        return addressPostal;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("addressLineOne", addressLineOne)
                .add("addressLineTwo", addressLineTwo)
                .add("addressCity", addressCity)
                .add("addressState", addressState)
                .add("addressPostal", addressPostal)
                .add("addressCountry", addressCountry)
                .toString();
    }


}
