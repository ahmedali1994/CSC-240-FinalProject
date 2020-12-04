package com.finalproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    EntityList entityList = new EntityList();
        entityList.characters.add(new Thief());
        entityList.characters.add(new Knight());
        entityList.characters.add(new Knight());
        entityList.characters.add(new Knight());
        entityList.characters.add(new Knight());
        entityList.characters.add(new Knight());
        entityList.characters.add(new Knight());
        entityList.characters.add(new Knight());
        Integer[] arr = new Integer[entityList.characters.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));






        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Enter how many monster you want to fight");
        int input = keyBoard.nextInt();
        for (int i = 0; i < input; i++)
        {
            System.out.println(entityList.characters.get(arr[i]));

        }



    }

    public void shffle()
    {
        Integer[] arr = new Integer[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
