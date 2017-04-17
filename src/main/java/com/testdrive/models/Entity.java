package com.testdrive.models;

import java.util.Random;

public abstract class Entity {
    protected int id;
    protected String name;

    public Entity(String name) {
        id = new Random().nextInt();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
