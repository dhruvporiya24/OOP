/*
Program Name: Pr_32
Program Description: Generic method to search element in LinkedList.
*/

import java.util.*;

public class Pr_32 {

    static <T> boolean searchElement(LinkedList<T> list, T key) {
        return list.contains(key);
    }

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1); nums.add(2); nums.add(3);

        System.out.println(searchElement(nums, 2));

        LinkedList<String> names = new LinkedList<>();
        names.add("Amit"); names.add("Rahul");

        System.out.println(searchElement(names, "Rahul"));
    }
}
