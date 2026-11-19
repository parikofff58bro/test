package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest {


    public static void main(String[] args) {
        ArrayList<Short> nums = new ArrayList<>();
        nums.add((short)12);
        short nums1 = 254;
        nums.add(nums1);
        nums.add(1,(short)88);
        nums.set(0,(short)77);
       // Short[] numbers = (Short[]) nums.toArray();

        //nums.remove(2);
        //nums.clear();
        nums.isEmpty();

        //for (int i= 0;i<nums.size();i++) System.out.println(nums.get(i));
    //for (short str: nums)System.out.println(str);

        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(12.4f);
        numbers.add(5.456f);
        numbers.add(72.414f);
        System.out.println(numbers.getFirst());
        for (float str: numbers)System.out.println(str);


    }


}
