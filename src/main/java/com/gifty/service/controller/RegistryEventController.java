package com.gifty.service.controller;

import com.gifty.service.domain.RegistryEvent;
import com.gifty.service.repository.RegistryEventRepository;
import com.gifty.service.utils.MappingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hcakb on 10/8/2017.
 */

@RestController
@RequestMapping(value = MappingConstants.REGISTRY_EVENT, produces = MediaType.APPLICATION_JSON_VALUE)
public class RegistryEventController {

    @Autowired
    private RegistryEventRepository registryEventRepository;

    @GetMapping(MappingConstants.ALL)
    @ResponseStatus(HttpStatus.FOUND)
    public List<RegistryEvent> getAllRegistryEvents() {
        return registryEventRepository.findAll();
    }

    @PostMapping(MappingConstants.ADD)
    @ResponseStatus(HttpStatus.OK)
    public void addRegistryEvent(@RequestBody RegistryEvent registryEvent) {
        registryEventRepository.save(registryEvent);
    }

}
