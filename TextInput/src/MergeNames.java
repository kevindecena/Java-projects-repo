/*
Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the names that appear in either or both arrays. The returned array should have no duplicates.
For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) should return an array containing Ava, Emma, Olivia, and Sophia in any order


 */


import java.util.HashSet;
import java.util.Set;

public class MergeNames {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqueNames = new HashSet<>();

        for (String name : names1) {
            uniqueNames.add(name);
        }

        for (String name : names2) {
            uniqueNames.add(name);
        }

        return uniqueNames.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = {"Ava", "Emma", "Olivia"};
        String[] names2 = {"Olivia", "Sophia", "Emma"};

        String[] uniqueNames = uniqueNames(names1, names2);
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
