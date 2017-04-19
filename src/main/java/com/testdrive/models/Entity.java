package com.testdrive.models;

import java.util.Random;

public abstract class Entity {
    protected int id;
    protected String name;

    public Entity(){
        setId(new Random().nextInt());
    }

    public Entity(String name) {
        this();
        setName(name);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
