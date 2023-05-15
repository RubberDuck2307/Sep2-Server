package model;

import java.io.Serializable;

public class Tag implements Serializable
{

    private String name;
    private Long id;

    public Tag(String name) {
        this.name = name;
    }

    public Tag(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
