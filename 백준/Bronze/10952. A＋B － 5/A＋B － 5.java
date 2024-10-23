import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (true){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = A+B;
            if (C == 0){
                break;
            }
            numbers.add(C);
        }
        scanner.close();

        for (int k : numbers) {
            System.out.println(k);
        }
    }
}