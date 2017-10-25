package com.gifty.service.controller;

import com.gifty.service.domain.Profile;
import com.gifty.service.repository.ProfileRepository;
import com.gifty.service.utils.MappingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hcakb on 10/11/2017.
 */

@RestController
@RequestMapping(value = MappingConstants.PROFILE, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProfileController {

    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping(MappingConstants.ALL)
    public List<Profile> getAllProfile() {
        return profileRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Profile getProfileById(@PathVariable String id) {
        //TODO add error if not found
       return profileRepository.findOne(id);
    }

    @PostMapping(value = MappingConstants.ADD)
    @ResponseStatus(HttpStatus.CREATED)
    public Profile addProfile(@RequestBody Profile profile) {
        //TODO error if not created
        profileRepository.insert(profile);
        return profile;
    }


}
