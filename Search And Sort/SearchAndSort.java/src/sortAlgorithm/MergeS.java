package sortAlgorithm;
import java.util.Scanner;

public class MergeS {

    // Phuong thuc mergeSort
    void mergeSort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    // Phuong thuc merge hai mang
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // In mang
    void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so luong phan tu trong mang
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        // Khai bao mang va nhap cac phan tu
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        MergeS ms = new MergeS();

        // In mang goc
        System.out.print("Mang goc: ");
        ms.printArray(arr);

        // Sap xep mang va in mang sau khi sap xep
        ms.mergeSort(arr);
        System.out.print("Mang sau khi sap xep: ");
        ms.printArray(arr);

        scanner.close();
    }
}
