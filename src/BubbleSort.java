public class BubbleSort {
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int[] arr)
    {
        int count = 1;
        while (count != 0)
        {
            count = 0;
            for (int i=0; i<arr.length-1; i++)
            {
                if (arr[i] > arr[i+1])
                {
                        swap(arr, i,i+1);
                        count++;
                }
            }
        }
    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for (int i=0; i<count; i++)
        {
            arr[i] = (int)(Math.random()*10001);
        }
        return arr;
    }

    public static String isSorted(int[] arr)
    {
        int count = 0;
        String output = "";
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i] <= arr[i+1])
            {
                count++;
                if (count==arr.length-1)
                {
                    output = "It is sorted.";
                }
                else
                {
                    output = "It is not sorted.";
                }
            }
        }
        return output;
    }

    public static String checkSum(int[] before, int[] after)
    {
        int beforeSum = 0;
        int afterSum = 0;
        String output = "";
        for (int i=0; i<before.length; i++)
        {
            beforeSum = beforeSum + before[i];
        }
        for (int j=0; j<after.length; j++)
        {
            afterSum = afterSum + after[j];
        }
        if (beforeSum == afterSum)
        {
            output = "The sums are equal.";
        }
        else
        {
            output = "The sums are not equal.";
        }
        return output;
    }
}
