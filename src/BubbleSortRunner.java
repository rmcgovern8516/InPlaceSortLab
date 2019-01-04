public class BubbleSortRunner {

    public static void main(String[] args) {
        //Create an array of integers
        int[] testArrBefore = BubbleSort.randIntArr(6);

        //Print it out before you sort
        System.out.print("Before: ");
        for (int num:testArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();

        //Sort it using bubbleSort
        BubbleSort.bubbleSort(testArrBefore);
        int[] testArrAfter = testArrBefore;

        //Print it out after you sort
        System.out.print("After: ");
        for (int num:testArrAfter){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println(BubbleSort.isSorted(testArrAfter));
        System.out.println(BubbleSort.checkSum(testArrBefore,testArrAfter));
    }
}
