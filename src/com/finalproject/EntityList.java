package com.finalproject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class EntityList {
    List<Entity> characters = new ArrayList<>();

    public void print()
    {
        for (Entity entity : characters)
        {
            System.out.println(entity.toString());

        }
    }

}
