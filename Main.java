public class Main {
    public static void main(String args[]) {
        int[] myList1 = {1, 25, 38, 68, 8, 45, 78, 9};
        int[] myList2 = {1, 25, 38, 68, 8, 45, 78, 9};
        int[] myList3 = {1, 25, 38, 68, 8, 45, 78, 9};

        BubbleSort.bubbleSort(myList1);

        QuickSort.quickSort(myList2,0,7);
        System.out.print("快速排序：");
        for (int m = 0; m < 8; m++) {
            System.out.print(myList2[m]+"\t");
        }
        System.out.print("\n");

        SelectionSort.selectionSort(myList3);

    }
}
