import java.util.Scanner;

public class FunnyString {

    public static void main(String args[]) {
        int testCase;
        String inputStr;

        try {
            Scanner sc = new Scanner(System.in);
            Scanner scStr = new Scanner(System.in);
            int i = 0, len, itr;
            System.out.println("Type your input!");
            testCase = sc.nextInt();
            String[] str = new String[testCase];
            String[] revStr = new String[testCase];

            while (i != testCase) {

                inputStr = scStr.nextLine();
                str[i] = inputStr;
                StringBuilder bufStr = new StringBuilder(str[i]);
                revStr[i] = bufStr.reverse().toString();
                len = str[i].length();

                char[] strChar = str[i].toCharArray();
                char[] revChar = revStr[i].toCharArray();

                for (itr = 1; itr < len; itr++) {
                    if (Math.abs(strChar[itr] - strChar[itr - 1]) != Math.abs(revChar[itr] - revChar[itr - 1])) {
                        break;
                    }
                }
                if (itr == len)
                    System.out.println("Funny");
                else
                    System.out.println("Not Funny");
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
