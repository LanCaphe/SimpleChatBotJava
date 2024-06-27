import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ready = 0;
        int toBeFixed = 0;
        int rejects = 0;
        
        for (int i = 0; i < n; i++) {
            int partStatus = scanner.nextInt();
            if (partStatus == 0) {
                ready++;
            } else if (partStatus == 1) {
                toBeFixed++;
            } else if (partStatus == -1) {
                rejects++;
            }
        }
        
        System.out.println(ready + " " + toBeFixed + " " + rejects);
    }
}
