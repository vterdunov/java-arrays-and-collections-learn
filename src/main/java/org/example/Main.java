package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Arrays class methods:");
        byte[] byteArray = {1, 2, 3, 4, 5};
        System.out.println("Byte array search: " + Arrays.binarySearch(byteArray, (byte)3));
        System.out.println("Byte array search with range: " + Arrays.binarySearch(byteArray, 1, 4, (byte)3));

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("Char array search: " + Arrays.binarySearch(charArray, 'c'));
        System.out.println("Char array search with range: " + Arrays.binarySearch(charArray, 1, 4, 'c'));

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Double array search: " + Arrays.binarySearch(doubleArray, 3.3));
        System.out.println("Double array search with range: " + Arrays.binarySearch(doubleArray, 1, 4, 3.3));

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        System.out.println("Float array search: " + Arrays.binarySearch(floatArray, 3.3f));
        System.out.println("Float array search with range: " + Arrays.binarySearch(floatArray, 1, 4, 3.3f));

        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Int array search: " + Arrays.binarySearch(intArray, 3));
        System.out.println("Int array search with range: " + Arrays.binarySearch(intArray, 1, 4, 3));

        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        System.out.println("Long array search: " + Arrays.binarySearch(longArray, 3L));
        System.out.println("Long array search with range: " + Arrays.binarySearch(longArray, 1, 4, 3L));

        short[] shortArray = {1, 2, 3, 4, 5};
        System.out.println("Short array search: " + Arrays.binarySearch(shortArray, (short)3));
        System.out.println("Short array search with range: " + Arrays.binarySearch(shortArray, 1, 4, (short)3));

        String[] stringArray = {"a", "b", "c", "d", "e"};
        System.out.println("String array search with comparator: " +
                Arrays.binarySearch(stringArray, "c", String::compareTo));
        System.out.println("String array search with range and comparator: " +
                Arrays.binarySearch(stringArray, 1, 4, "c", String::compareTo));


        System.out.println("\nTesting Collections class methods:");

        List<Integer> intList = java.util.Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Collections search in Integer list: " +
                Collections.binarySearch(intList, 3));

        List<String> stringList = java.util.Arrays.asList("a", "b", "c", "d", "e");
        System.out.println("Collections search in String list with comparator: " +
                Collections.binarySearch(stringList, "c", String::compareTo));
    }
}