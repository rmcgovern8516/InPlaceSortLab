public class Runner {

    public static void main(String[] args) {
        //Create an array of integers
        int[] intArrBefore = InPlaceSorts.randIntArr(5);
        double[] doubArrBefore = InPlaceSorts.randDoubleArr(5);
        String[] stringArrBefore = InPlaceSorts.randStringArr(5,4);

        //Copy arrays
        int[] copyInt = InPlaceSorts.copyIntArray(intArrBefore);
        double[] copyDouble = InPlaceSorts.copyDoubleArray(doubArrBefore);
        String[] copyString = InPlaceSorts.copyStringArray(stringArrBefore);

        //Print it out before you sort
        System.out.print("Int Array Before: ");
        for (int num:intArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("Double Array Before: ");
        for (double num:doubArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.print("String Array Before: ");
        for (String num:stringArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();

        //Sort it using bubbleSort
        InPlaceSorts.insertionSort(intArrBefore);
        InPlaceSorts.selectionSort(doubArrBefore);
        InPlaceSorts.bubbleSort(stringArrBefore);

        System.out.println("____________________________________________");

        //Print it out after you sort
        System.out.print("Int Array After: ");
        for (int num:intArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(InPlaceSorts.isIntSorted(intArrBefore));
        System.out.println(InPlaceSorts.checkIntSum(intArrBefore, copyInt));

        System.out.print("Double Array After: ");
        for (double num:doubArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(InPlaceSorts.isDoubleSorted(doubArrBefore));
        System.out.println(InPlaceSorts.checkDoubleSum(doubArrBefore, copyDouble));

        System.out.print("String Array After: ");
        for (String num:stringArrBefore){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("It is sorted.");

    }
}
