import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String[] arrayToSort = {"banana", "Apple", "cherry", "blueberry", "Elderberry"};
        selectionSortStrings(arrayToSort);
        // Print the sorted array
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void selectionSortStrings(String[] sortedArray) {
        int arraySize = sortedArray.length;

        for (int i = 0; i < arraySize - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arraySize; j++) {
                // The compareTo method compares two strings lexicographically.
                // It returns a negative integer if the first string (arr[j]) comes before the second string (arr[minIndex]).
                //It returns a positive integer if the first string comes after the second string.
                // It returns zero if the strings are equal
                if (sortedArray[j].compareTo(sortedArray[minIndex]) < 0) {//
                    minIndex = j;
                }
            }
            // Swap the elements
            String temp = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = temp;
        }
    }


}