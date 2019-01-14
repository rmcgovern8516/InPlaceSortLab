public class Runner {

    public static void main(String[] args) {
        //Create an array of integers
        int[] intArrBefore = InPlaceSorts.randIntArr(1000);
        double[] doubArrBefore = InPlaceSorts.randDoubleArr(1000);
        String[] stringArrBefore = InPlaceSorts.randStringArr(1000,4);

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


        //Setting Timers Up
        long insertionTimeStart = 0;
        long selectionTimeStart = 0;
        long bubbleTimeStart = 0;
        long insertionTimeStop = 0;
        long selectionTimeStop = 0;
        long bubbleTimeStop = 0;

        //Sorting + Timers
        insertionTimeStart = System.nanoTime();
        InPlaceSorts.insertionSort(intArrBefore);
        insertionTimeStop = System.nanoTime()-insertionTimeStart;

        selectionTimeStart = System.nanoTime();
        InPlaceSorts.selectionSort(doubArrBefore);
        selectionTimeStop = System.nanoTime()-selectionTimeStart;

        bubbleTimeStart = System.nanoTime();
        InPlaceSorts.bubbleSort(stringArrBefore);
        bubbleTimeStop = System.nanoTime()-bubbleTimeStart;

        System.out.println("____________________________________________");



        //Printing out sort times
        System.out.println("Time for insertion sort: "+insertionTimeStop+" nanoseconds");
        System.out.println("Time for selection sort: "+selectionTimeStop+" nanoseconds");
        System.out.println("Time for bubble sort: "+bubbleTimeStop+" nanoseconds");
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
