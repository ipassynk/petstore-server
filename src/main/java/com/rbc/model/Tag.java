package com.rbc.model;

/**
 * Created by juliapassynkova on 15-11-18.
 */
public class Tag {
    private Integer id;
    private String name;

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


    public Tag(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
