
import java.util.StringTokenizer;
import java.util.Scanner;


public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of lines of Program: ");
        int numLines = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= numLines; i++) {
            System.out.print("Enter String#" + i + ": ");
            String line = input.nextLine().trim();

            String[] tokens = line.split("\\s+");
            System.out.println("Output =");
            int count = 0;
            for (String token : tokens) {
                count++;
                String attribute;
                if (token.matches("[A-D]")) {
                    attribute = "Identifier";
                } else {
                    attribute = "operator";
                }
                System.out.println("TOKEN#" + count + " " + token + " " + attribute);
            }
            System.out.println("TOTAL NUMBER OF TOKENS FOR STRING#" + i + ":" + count);
            System.out.println("END OF STRING#" + i);
            System.out.println("===================");
        }

        input.close();
    }

}