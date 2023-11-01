public class InsertionSort {

    void sort(int[] numbers) {
        int nums = numbers.length;
        for (int i = 0; i < nums; ++i) {
            int keys = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > keys) {
                numbers[j + 1] = numbers[j];
                j -= 1;
            }
            numbers[j + 1] = keys;
        }
    }

    void print(int[] numbers) {
        System.out.print("Elements printed in order: ");
        for (int nums : numbers) {
            System.out.print(nums + " ");
        }
    }
}
