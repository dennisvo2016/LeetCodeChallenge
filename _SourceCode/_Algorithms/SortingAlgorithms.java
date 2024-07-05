public class SortingAlgorithms {
    public static void printArray(int no, int[] a)
    {
        System.out.printf("%d:", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d", a[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            //chạy a.length vòng lặp để sort
            for (int j = 0; j < a.length-i-1; j++) {
                //so sánh j với j+1 -> j+1 < n-i (bỏ đi i item sau i vòng lặp)
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            printArray(i, a);
        }
    }

    public static void bubbleSortAdvanced(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            //chạy a.length vòng lặp để sort
            boolean isSorted = true;
            for (int j = 0; j < a.length-i-1; j++) {
                //so sánh j với j+1 -> j+1 < n-i (bỏ đi i item sau i vòng lặp)
                if (a[j] > a[j+1]) {
                    isSorted = false;
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
            printArray(i, a);   

            if (isSorted) {
                break;
            }
        }
    }

    public static void selectionSort(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
            }

            printArray(i, a);
        }
    }

    public static void insertionSort(int[] a)
    {
        for (int i = 1; i < a.length; i++) {
            int j = i-1;
            int tmp = a[i];
            while (j >= 0 && a[j] > tmp){ //Nếu a[j] > a[i] value -> đẩy a[j] về phải 1 đv
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = tmp;

            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1, 2}; //Test trường hợp thường
        int[] b = {1, 2, 3, 4, 5, 7, 6}; //Test trường hợp nâng cấp

        insertionSort(a);
    }
}
