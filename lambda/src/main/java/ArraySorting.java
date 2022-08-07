public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();
        //as.sort();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);

        Sorting quickSort = () -> System.out.println("Quick sorting");
        as.sort(quickSort);
        Sorting bubbleSort = () -> System.out.println("Quick sorting");
        as.sort(bubbleSort);

    }
    // i implemented the interface as a parameter and call the methods from them.Because i dont know will i use the bubble sorting
    // or quick sorting. This method receiving all the sorting implementetion. Example is on the above
    private void sort(Sorting sorting){
        sorting.sort();
    }
}
