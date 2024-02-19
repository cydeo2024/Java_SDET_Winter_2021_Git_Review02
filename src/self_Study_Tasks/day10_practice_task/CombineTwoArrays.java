package self_Study_Tasks.day10_practice_task;

import java.util.ArrayList;

public class CombineTwoArrays {
    public static void main(String[] args) {
        String[]  arr1 = {"A", "B", "C"};//create two string arrays
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();//combined them into one array list

        for (String each : arr1){
            list.add(each);
        }

        for (String each : arr2){
            list.add(each);
        }
        System.out.println(list);


    }
}
/*
Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */