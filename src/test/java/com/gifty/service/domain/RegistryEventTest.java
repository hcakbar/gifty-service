package com.gifty.service.domain;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by hcakb on 10/8/2017.
 */
public class RegistryEventTest {

    private RegistryEvent registryEvent;

    @Test
    public void checkRegistryEvent() {
        registryEvent = new RegistryEvent("", false, "", "", "", "");
        assertTrue(!registryEvent.isRegistryOwner());
    }

}
