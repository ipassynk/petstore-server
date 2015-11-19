package com.rbc.controller;

/**
 * Created by juliapassynkova on 15-11-18.
 */

import com.rbc.model.Pet;
import com.rbc.model.Tag;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.rbc.model.PetFactory;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashSet;

@RestController
@EnableAutoConfiguration
@RequestMapping("/petstore/api/pet")
public class PetStoreController {

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> addPet(@Valid @RequestBody Pet pet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMessage;
            errorMessage = "validation error";
            return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
        }

        // TODO - save pet

        return new ResponseEntity<>(pet, HttpStatus.OK);
    }

    @RequestMapping(value = "{petId}", method = RequestMethod.DELETE)
    Integer deletePet(@PathVariable Integer petId) {
        // TODO delete pet
        return petId;
    }


    @RequestMapping(value = "{petId}", method = RequestMethod.GET)
    public Pet getPet(@PathVariable Integer petId) {
        PetFactory<Pet> petFactory = Pet::new;
        Pet pet = petFactory.create("Haireless guinea pig",
                petId,
                new HashSet<String>(Arrays.asList(
                        new String[]{"assets/pets/1.jpg", "assets/pets/2.jpg",
                                "assets/pets/3.jpg",
                                "assets/pets/4.jpg"})),
                new HashSet<Tag>(Arrays.asList(new Tag[]{
                        new Tag(1, "kids"), new Tag(2, "rodents"),
                        new Tag(3, "small")})),
                Pet.Status.available);

        return pet;
    }
}

