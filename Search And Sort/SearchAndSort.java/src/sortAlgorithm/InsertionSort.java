package sortAlgorithm;
import java.util.Scanner;

public class InsertionSort {

    // Phuong thuc sap xep chen (Insertion Sort)
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {  // Đổi vòng lặp từ i=1 đến n-1 thành i<n
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr[0..i-1] có giá trị lớn hơn key, sang vị trí tiếp theo
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;  // Chen key vao dung vi tri
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

        // In mang goc
        System.out.println("Mang goc: ");
        InsertionSort is = new InsertionSort();
        is.printArray(arr);

        // Sap xep mang va in mang sau khi sap xep
        is.insertionSort(arr);
        System.out.println("Mang sau khi sap xep: ");
        is.printArray(arr);

        scanner.close();
    }
}
