import java.util.Scanner;

public class meore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შეიყვანეთ მასივის სიგრძე");
        int a = scanner.nextInt();
        int sum = 0;
        System.out.println("___________");
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            int arr[] = {b};
            if (i % 2 == 0) {

                sum += b;
            }

        }
        System.out.println("___________");
        System.out.println("ჯამი: " + sum);
    }
}
