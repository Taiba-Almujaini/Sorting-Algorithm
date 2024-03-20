import java.util.Arrays;

public class SortingInteger{
     public static void main(String[] args)
     {
     Integer[] arrayNumbers={34,56,78,22,11,98,80};
         selectionSort(arrayNumbers);// call selectionSort method
         System.out.println("Sorted array in descending order:"+Arrays.toString(arrayNumbers)); // print sorted array on descending order

     }

     public static void selectionSort(Integer[]sortedArray)
     {
         Integer arraySize=sortedArray.length;

         for(Integer i=0; i<arraySize-1;i++)
         {
             Integer maxIndex=i;// Assume the current index as the index of the maximum value
             for(Integer j=i+1;j<arraySize;j++)
             {
               if(sortedArray[j]>sortedArray[maxIndex])  // If the value at index j is greater than the value at maxIndex, update maxIndex
               {
                   maxIndex=j;
               }
             }
             // Swap the elements
             Integer temp=sortedArray[maxIndex];
             sortedArray[maxIndex]=sortedArray[i];
             sortedArray[i]=temp;
         }


     }

}