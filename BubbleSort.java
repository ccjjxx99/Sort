public class BubbleSort{
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = arr.length - 1; j > i; j--)
            {
                if (arr[j] < arr[j - 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.print("冒泡排序：");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\n");
    }
}