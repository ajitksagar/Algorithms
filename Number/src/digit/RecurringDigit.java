package digit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RecurringDigit {


    public static void main(String args[]) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            char[] chars = str.toCharArray();
            //Created map for each digit
            final ConcurrentMap<Character, AtomicInteger> map = new ConcurrentHashMap<>();
            for (char c : chars) {
                map.putIfAbsent(c, new AtomicInteger(0));
                map.get(c).incrementAndGet();
            }
            //To find max count of that digit
            Map.Entry<Character, AtomicInteger> maxEntry = null;

            for (Map.Entry<Character, AtomicInteger> entry : map.entrySet()) {

                if (maxEntry == null || entry.getValue().intValue() > maxEntry.getValue().intValue()) {
                    maxEntry = entry;
                }
            }
            assert maxEntry != null;
            System.out.println("Number "+ maxEntry.getKey() + " appears " + maxEntry.getValue() +" times");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
