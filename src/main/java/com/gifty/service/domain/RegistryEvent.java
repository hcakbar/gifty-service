package com.gifty.service.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hcakb on 10/8/2017.
 */

@Document(collection = "registryEvent")
public class RegistryEvent {

    @Id
    private String  id;
    private boolean isRegistryOwner;
    private String  registryOwnerId;
    private String  registryEventId;
    private String  registryEventName;
    private String  registryEventDate;

    private RegistryEvent() {

    }

    public RegistryEvent(boolean isRegistryOwner, String registryOwnerId, String registryEventId,
        String registryEventName, String registryEventDate) {

        this.isRegistryOwner = isRegistryOwner;
        this.registryOwnerId = registryOwnerId;
        this.registryEventId = registryEventId;
        this.registryEventName = registryEventName;
        this.registryEventDate = registryEventDate;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public boolean isRegistryOwner() {

        return isRegistryOwner;
    }

    public void setIsRegistryOwner(boolean registryOwner) {

        this.isRegistryOwner = registryOwner;
    }

    public String getRegistryOwnerId() {

        return registryOwnerId;
    }

    public void setRegistryOwnerId(String registryOwnerId) {

        this.registryOwnerId = registryOwnerId;
    }

    public String getRegistryEventId() {

        return registryEventId;
    }

    public void setRegistryEventId(String registryEventId) {

        this.registryEventId = registryEventId;
    }

    public String getRegistryEventName() {

        return registryEventName;
    }

    public void setRegistryEventName(String registryEventName) {

        this.registryEventName = registryEventName;
    }

    public String getRegistryEventDate() {

        return registryEventDate;
    }

    public void setRegistryEventDate(String registryEventDate) {

        this.registryEventDate = registryEventDate;
    }

    @Override
    public String toString() {

        return "RegistryEvent{" +
            "id='" + id + '\'' +
            ", isRegistryOwner=" + isRegistryOwner +
            ", registryOwnerId='" + registryOwnerId + '\'' +
            ", registryEventId='" + registryEventId + '\'' +
            ", registryEventName='" + registryEventName + '\'' +
            ", registryEventDate='" + registryEventDate + '\'' +
            '}';
    }
}


