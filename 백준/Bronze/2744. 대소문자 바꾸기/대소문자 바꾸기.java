import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch)); 
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(result);
    }
}