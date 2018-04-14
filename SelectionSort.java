public class SelectionSort {
    public static void selectionSort(int[] arr){
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {     // 寻找最小的数
                    min = j;                 // 将最小数的索引保存
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.print("选择排序：");
        for (int m = 0; m < 8; m++) {
            System.out.print(arr[m]+"\t");
        }
        System.out.print("\n");
    }
}
