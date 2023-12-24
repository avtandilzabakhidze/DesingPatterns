package pattern.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 3, 1, 7 };

        SortingStrategy bubbleSort = new BubbleSort();
        SortingStrategy mergeSort = new MergeSort();
        SortingStrategy quickSort = new QuickSort();

        Sorter sorter = new Sorter(bubbleSort);
        sorter.performSort(array); // Sort using Bubble Sort

        sorter.setSortingStrategy(mergeSort);
        sorter.performSort(array); // Sort using Merge Sort

        sorter.setSortingStrategy(quickSort);
        sorter.performSort(array); // Sort using Quick Sort
    }
}
