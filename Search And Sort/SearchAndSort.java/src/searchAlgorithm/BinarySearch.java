package searchAlgorithm;
import java.util.Scanner;

public class BinarySearch {

    // Phương thức tìm kiếm nhị phân dạng vòng lặp
    int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) return mid;       // Tìm thấy phần tử
            if (arr[mid] < x) left = mid + 1;    // Tìm bên phải
            else right = mid - 1;                // Tìm bên trái
        }
        return -1;  // Không tìm thấy
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch search = new BinarySearch();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + (i + 1) + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhap phan tu can tim: ");
        int x = scanner.nextInt();

        int result = search.binarySearch(arr, x);
        System.out.println(result != -1 
                ? "Phan tu " + x + " tim thay tai vi tri: " + result
                : "Phan tu " + x + " khong ton tai trong mang.");
        
        scanner.close();
    }
}
