public class SortingAlgoritm {
    public static void main(String[] args) {
        Integer[] arrayToSort = {324, 123, 556, 454, 121};
        selectionSort(arrayToSort);
        System.out.println("Sorted array:");
        for (Integer i = 0; i < arrayToSort.length; i++) { //print sorted array
            System.out.print(arrayToSort[i] + " ");
        }
    }

    public static void selectionSort(Integer[] sortedArray) {
        Integer sizeOfArrayToSort = sortedArray.length;

        // Loop  from the first to the second-to-last element
        for (Integer i = 0; i < sizeOfArrayToSort ; i++) {
            // Assume the first unsorted element is the smallest
            Integer minNumberIndex = i;

            // Check the rest of the array for something smaller
            for (Integer j = i + 1; j < sizeOfArrayToSort; j++) {
                // If a smaller element is found, update minNumberIndex
                if (sortedArray[j] < sortedArray[minNumberIndex]) {
                    minNumberIndex = j;
                }
            }

            // Swap the smallest found element with the first unsorted position
            Integer tempSwapVariable = sortedArray[minNumberIndex];
            sortedArray[minNumberIndex] = sortedArray[i];
            sortedArray[i] = tempSwapVariable;
        }
    }
}
