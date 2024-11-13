package searchAlgorithm;
import java.util.Scanner;

public class LinearSearch {

    // Phuong thuc tim kiem tuyen tinh
    int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;  // Tim thay phan tu
        }
        return -1;  // Khong tim thay
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinearSearch search = new LinearSearch();

        // Nhap so luong phan tu trong mang
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhap cac phan tu trong mang
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Nhap phan tu can tim
        System.out.print("Nhap phan tu can tim: ");
        int x = scanner.nextInt();

        // Tim kiem tuyen tinh
        int result = search.linearSearch(arr, x);
        System.out.println(result != -1 
                ? "Phan tu " + x + " tim thay tai vi tri: " + result
                : "Phan tu " + x + " khong ton tai trong mang.");

        scanner.close();
    }
}
