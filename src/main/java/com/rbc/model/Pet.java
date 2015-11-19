package com.rbc.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Set;

/**
 * Created by juliapassynkova on 15-11-18.
 */
public class Pet {
    public enum Status {
        available,
        outofstock
    }

    @NotEmpty
    @Size(min=2, max=30)
    private String name;
    private Integer id;
    private Set<String> photoUrls;
    private Set<Tag> tags;

    private Pet.Status status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<String> getPhotoUrls() {
        return photoUrls;
    }

    public void sePhotoUrls(Set<String> urls) {
        this.photoUrls = photoUrls;
    }

    Pet() {
    }

    public Pet(String name, Integer id, Set<String> photoUrls, Set<Tag> tags, Pet.Status status) {
        this.name = name;
        this.id = id;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (id != null ? !id.equals(pet.id) : pet.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
