public class task1 {
    public static void main(String[] args) {

        int[] array = { 5, 4, 7, 2, 3, 1, 6, 2 };
        print(array);
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int lo, int hi) {
        if (lo < hi) {
            int mid = (lo + hi) / 2;
            sort(array, lo, mid);
            sort(array, mid + 1, hi);
            merge(array, lo, mid, hi);
            print(array);
        }
    }

    private static void merge(int[] array, int lo, int mid, int hi) {

        int[] left = new int[(mid - lo) + 2];
        int[] right = new int[hi - mid + 1];

        System.arraycopy(array, lo, left, 0, left.length - 1);
        System.arraycopy(array, mid + 1, right, 0, left.length - 1);

        left[left.length - 1] = 100;
        right[right.length - 1] = 100;
        int i = 0;
        int j = 0;

        for (; lo <= hi; lo++) {
            if (left[i] <= right[j]) {
                array[lo] = left[i];
                i++;
            } else {
                array[lo] = right[j];
                j++;
            }
        }
    }

    private static void print(int[] array) {
        System.out.println();
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
