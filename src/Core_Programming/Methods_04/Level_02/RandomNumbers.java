package Core_Programming.Methods_04.Level_02;

public class RandomNumbers {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;

        for (int n : arr) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum / arr.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] res = findAverageMinMax(arr);

        System.out.println("Average: " + res[0]);
        System.out.println("Min: " + res[1]);
        System.out.println("Max: " + res[2]);
    }
}

