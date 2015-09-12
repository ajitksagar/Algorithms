import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCase = Integer.parseInt(br.readLine());
            int i = 0, itr;

            while (i < testCase) {

                String inputStr = br.readLine();

                char[] strChar = inputStr.toCharArray();
                char[] revChar = new StringBuilder(inputStr).reverse().toString().toCharArray();
                int length = inputStr.length();

                for (itr = 0; itr < length - 1; itr++) {
                    if (Math.abs(strChar[itr + 1] - strChar[itr]) != Math.abs(revChar[itr + 1] - revChar[itr])) {
                        break;
                    }
                }
//                System.out.println("===========" + itr + " " + length);
                if ((itr + 1 )== length)
                    System.out.println("Funny");
                else
                    System.out.println("Not Funny");
                i++;
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
