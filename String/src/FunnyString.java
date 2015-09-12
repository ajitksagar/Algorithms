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
            String str ;
            String revStr;

            while (i != testCase) {

                inputStr = scStr.nextLine();
                str = inputStr;
                StringBuilder bufStr = new StringBuilder(str);
                revStr = bufStr.reverse().toString();
                len = str.length();

                char[] strChar = str.toCharArray();
                char[] revChar = revStr.toCharArray();

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
