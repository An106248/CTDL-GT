package sortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Mang ban dau: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);
        
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(arr));

        scanner.close();
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[low + (high - low) / 2];
        int i = low, j = high;
        
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (i < high) quickSort(arr, i, high);
    }
}
