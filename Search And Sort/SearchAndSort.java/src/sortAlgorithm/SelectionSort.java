package sortAlgorithm;

import java.util.Scanner;

public class SelectionSort {
    
    // Phuong thuc sap xep Selection Sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            
            // Tim phan tu nho nhat trong mang con
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            
            // Hoan doi phan tu nho nhat voi phan tu dau tien trong mang con
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    // Phuong thuc in mang
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        SelectionSort ss = new SelectionSort();
        
        // In mang ban dau
        System.out.println("Mang ban dau:");
        ss.printArray(arr);
        
        // Sap xep mang
        ss.sort(arr);
        
        // In mang sau khi sap xep
        System.out.println("Mang sau khi sap xep:");
        ss.printArray(arr);

        scanner.close();
    }
}
