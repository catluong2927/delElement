import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, temp;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] Arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            Arr[i] = scanner.nextInt();
        }

        System.out.println("Nhập số muốn xóa: ");
        int delElement = scanner.nextInt();

        for (temp = i = 0; i < n; i++) {
            if (Arr[i] != delElement) {
                Arr[temp] = Arr[i];
                temp++;
            }
        }

        n = temp;

        System.out.println("Mảng còn lại sau khi xóa phần tử " + delElement + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(Arr[i]+" ");
        }
    }
}