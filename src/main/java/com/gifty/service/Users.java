package com.gifty.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by hcakb on 8/20/2017.
 */

@Document(collection = "Users")
public class Users {


    @Id
    private String userId;
    private String fName;
    private String lName;
//    private String mName;
//    private String phone;
//    private String email;
//    private String gender;
//    private String address;
//    private String street;
//    private String city;
//    private String stateCd;
//    private String zip;

    public Users(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
//        this.mName = mName;
//        this.phone = phone;
//        this.email = email;
//        this.gender = gender;
//        this.address = address;
//        this.street = street;
//        this.city = city;
//        this.stateCd = stateCd;
//        this.zip = zip;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

//    public String getmName() {
//        return mName;
//    }
//
//    public void setmName(String mName) {
//        this.mName = mName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getStateCd() {
//        return stateCd;
//    }
//
//    public void setStateCd(String stateCd) {
//        this.stateCd = stateCd;
//    }
//
//    public String getZip() {
//        return zip;
//    }
//
//    public void setZip(String zip) {
//        this.zip = zip;
//    }


}
