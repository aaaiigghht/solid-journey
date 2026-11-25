import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String message1 = in.nextLine();
        String message2 = in.nextLine();
        String message3 = in.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message1.length(); i += 2) {
            int a = Integer.parseInt(message1.substring(i, i + 2), 16);
            int b = Integer.parseInt(message2.substring(i, i + 2), 16);
            int c = Integer.parseInt(message3.substring(i, i + 2), 16);

            result.append((char) (a ^ b ^ c));
        }

        System.out.println(result);
    }
}
