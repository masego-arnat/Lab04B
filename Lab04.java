
import java.util.StringTokenizer;
import java.util.Scanner;


public class Lab04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of lines of Program: ");
        int numOfLines = input.nextInt();
        input.nextLine(); // consume the newline character

        for (int i = 1; i <= numOfLines; i++) {
            System.out.print("Enter String#" + i + ": ");
            String str = input.nextLine().trim(); // trim leading/trailing spaces

            StringTokenizer st = new StringTokenizer(str, "+-/* ", true); // tokenize on operators and spaces
            int count = 0; // initialize token count

            System.out.println("Output = ");
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                    System.out.println("TOKEN#" + (++count) + " " + token + " operator");
                } else if (!token.equals(" ")) {
                    System.out.println("TOKEN#" + (++count) + " " + token + " Identifier");
                }
            }

            System.out.println("TOTAL NUMBER OF TOKENS FOR STRING#" + i + ":" + count);
            System.out.println("END OF STRING#" + i);
            System.out.println("===================");
        }

   }
 

}