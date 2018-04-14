public class QuickSort {
    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r)
            return;
        int i = l;
        int j = r;
        int key = arr[l];//选择第一个数为key
        while (i < j) {
            while (i < j && arr[j] >= key) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            while (i < j && arr[i] <= key) {
                i++;
            }
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
            }
        }
        if(i>l)quickSort(arr,l,j-1);
        if(j<r)quickSort(arr,i+1,r);
    }
}