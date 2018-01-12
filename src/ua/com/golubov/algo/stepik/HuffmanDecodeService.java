package ua.com.golubov.algo.stepik;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HuffmanDecodeService {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int stringLength = in.nextInt();
        in.nextLine();
        List<String> entries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            entries.add(in.nextLine());
        }
        String encoded = in.nextLine();
        Map<String, String> dictionary = buildDictionary(entries);
        System.out.println(decode(encoded, dictionary));
        // put your code here
    }


    public static Map<String, String> buildDictionary(List<String> strings) {
        return strings.stream().map(s -> s.split(": ")).collect(Collectors.toMap(a -> a[1], a -> a[0]));
    }

    public static String decode(String encoded, Map<String, String> dictionary) {
        StringBuilder decoded = new StringBuilder();
        StringBuilder key = new StringBuilder();
        for (Character c : encoded.toCharArray()) {
            key.append(c);
            if (dictionary.containsKey(key.toString())) {
                decoded.append(dictionary.get(key.toString()));
                key.setLength(0);
            }
        }
        return decoded.toString();
    }


}
