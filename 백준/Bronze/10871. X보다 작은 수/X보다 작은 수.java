import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String[] parts = input.split(" ");

        int N = Integer.parseInt(parts[0]);
        int X = Integer.parseInt(parts[1]);
        int[] arr = new int[N];

        input = br.readLine();
        parts = input.split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        for (int num : arr){
            if (num<X){
                bw.write(num+" ");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

