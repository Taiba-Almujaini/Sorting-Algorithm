import java.util.ArrayList;

public class SortingAlgoritm {
    public static void main(String[] args) {
        ArrayList<Integer> arrayToSort = new ArrayList<>();
        arrayToSort.add(324);
        arrayToSort.add(123);
        arrayToSort.add(556);
        arrayToSort.add(454);
        arrayToSort.add(121);

        selectionSort(arrayToSort);

        // Print the sorted ArrayList
        System.out.println("Sorted array:");
        for (Integer number : arrayToSort) {
            System.out.print(number + " ");
        }
    }

    public static void selectionSort(ArrayList<Integer> sortedArray) {
        Integer sizeOfArrayToSort = sortedArray.size();

        // Loop  from the first to the second-to-last element
        for (Integer i = 0; i < sizeOfArrayToSort ; i++) {
            // Assume the first unsorted element is the smallest
            Integer minNumberIndex = i;

            // Check the rest of the array for something smaller
            for (Integer j = i + 1; j < sizeOfArrayToSort; j++) {
                // If a smaller element is found, update minNumberIndex
                if (sortedArray.get(j) < sortedArray.get(minNumberIndex)) {
                    minNumberIndex = j;
                }
            }

            // Swap the smallest found element with the first unsorted position
            Integer tempSwapVariable = sortedArray.get(minNumberIndex);
            sortedArray.set(minNumberIndex, sortedArray.get(i));
            sortedArray.set(i, tempSwapVariable);
        }
    }
}
