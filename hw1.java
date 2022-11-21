import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scan.nextInt();
        int summa = 0;
        int multipl = 1;
        for (int i = 1; i <= n; i++){
            summa += i;
            multipl *= i;
        }
        System.out.printf("Сумма чисел от 1 до n = %d, произведение от 1 до n = %d", summa, multipl);
    }
}
