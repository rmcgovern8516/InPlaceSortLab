public class BubbleSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int[] arr){
        boolean state = true;
        while (state = true){
            for (int i=0; i<arr.length-1; i++){
                while (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }
}
