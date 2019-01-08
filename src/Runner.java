public class Runner {

    public static void main(String[] args) {
        //Create an array of integers
        int[] intArrBefore = InPlaceSorts.randIntArr(5);
        double[] doubArrBefore = InPlaceSorts.randDoubleArr(5);
        String[] stringArrBefore = {"hello","my","name","is","ryan"};

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
        InPlaceSorts.selectionSort(intArrBefore);
        int[] intArrAfter = intArrBefore;

        //Print it out after you sort
        System.out.print("Int Array After: ");
        for (int num:intArrAfter){
            System.out.print(num+" ");
        }
        System.out.println();

        System.out.println(InPlaceSorts.isSorted(intArrAfter));
        System.out.println(InPlaceSorts.checkSum(intArrBefore,intArrAfter));
    }
}
