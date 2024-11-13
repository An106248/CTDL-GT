package sortAlgorithm;
import java.util.Scanner;

public class BubbleSort {
    // Sap xep mang tang dan
    public static void bubbleSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((ascending && arr[j] > arr[j + 1]) || (!ascending && arr[j] < arr[j + 1])) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Hoan doi gia tri cua 2 phan tu
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // In mang
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so luong phan tu trong mang
        System.out.print("Nhap so luong phan tu trong mang: ");
        int n = scanner.nextInt();

        // Khai bao mang va nhap cac phan tu
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        // In mang truoc khi sap xep
        System.out.println("Mang truoc khi sap xep:");
        printArray(arr);

        // Sap xep tang dan
        bubbleSort(arr, true);
        System.out.println("Mang sau khi sap xep tang dan:");
        printArray(arr);

        // Nhap lai mang cho sap xep giam dan
        System.out.println("Nhap lai cac phan tu cua mang de sap xep giam dan:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Sap xep giam dan
        bubbleSort(arr, false);
        System.out.println("Mang sau khi sap xep giam dan:");
        printArray(arr);

        scanner.close();
    }
}
