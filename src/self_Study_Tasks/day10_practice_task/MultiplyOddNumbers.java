package self_Study_Tasks.day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 != 0){
                list.set(i, list.get(i)*2);

            }

        }
        System.out.println("list = " + list);
    }
}

/*
Create a class called MultiplyOddNumbers and write a program with the following specifications:
   6.1 Given an ArrayList, multiply each odd number by 2.

				Example:
					list = [1,2,3,4,5];

				output:
					[2,2,6,4,10]

 */