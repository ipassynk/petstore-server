package com.rbc.model;

import java.util.Set;

/**
 * Created by juliapassynkova on 15-11-18.
 */
public interface PetFactory<P extends Pet> {
    P create(String name, Integer id, Set<String> photoUrls, Set<Tag> tags, Pet.Status status);
}
