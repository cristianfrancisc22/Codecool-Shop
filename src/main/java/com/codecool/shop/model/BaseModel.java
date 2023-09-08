package com.codecool.shop.model;


import lombok.Getter;

import java.lang.reflect.Field;

@Getter
public class BaseModel {

    protected int id;
    protected String name;
    protected String description;

    public BaseModel(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (Field field : this.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object value;
            try {
                value = field.get(this);
                if (value != null) {
                    sb.append(field.getName()).append(":").append(value).append(",");
                }
            } catch (IllegalAccessException ignored) {

            }
        }
        return sb.toString();
    }

}
