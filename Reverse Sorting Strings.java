import java.util.Arrays;

public class ReverseSortingStrings{

   public static void main(String[] args){
       String[] arrayToStore={"Ahmed","Dana","emad","zainb","Tayba"};
       selectionSortStrings(arrayToStore);
       //print sorted array
       System.out.println(Arrays.toString(arrayToStore));
   }
   public static void selectionSortStrings(String[] sortedArray)
   {
       Integer arraySize = sortedArray.length;
       for(Integer i=0;i<arraySize;i++)
       {
         Integer maxIndex=i;
         for(Integer j=i+1; j<arraySize;j++)
         {
             // If the string at index j is greater than the string at maxIndex, update maxIndex
             if (sortedArray[j].compareTo(sortedArray[maxIndex])>0){
                 maxIndex=j;
             }
         }
           // Swap the elements
         String temp=sortedArray[maxIndex];
         sortedArray[maxIndex]=sortedArray[i];
         sortedArray[i]=temp;
       }


   }

}