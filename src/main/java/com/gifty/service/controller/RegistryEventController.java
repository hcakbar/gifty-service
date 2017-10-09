package com.gifty.service.controller;

import com.gifty.service.domain.RegistryEvent;
import com.gifty.service.repository.RegistryEventRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hcakb on 10/8/2017.
 */

@RestController
@RequestMapping(value = "/registryEvent", produces = MediaType.APPLICATION_JSON_VALUE)
public class RegistryEventController {

    private RegistryEventRepository registryEventRepository;

    public RegistryEventController(RegistryEventRepository registryEventRepository) {
        this.registryEventRepository = registryEventRepository;
    }

    @GetMapping()
    public List<RegistryEvent> getAllRegistryEvents() {
        List<RegistryEvent> events = this.registryEventRepository.findAll();
        return events;
    }

    @PostMapping
    public void addRegistryEvent(@RequestBody RegistryEvent registryEvent) {
        this.registryEventRepository.save(registryEvent);
    }



}
