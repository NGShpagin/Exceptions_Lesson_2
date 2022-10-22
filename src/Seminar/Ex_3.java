package Seminar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ex_3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("ex_3.txt");
        StringBuilder sb = new StringBuilder();
        int a;
        try {
            while ((a = fr.read()) != -1) {
                char c = (char) a;
                sb.append(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        List<String> lines = new ArrayList<>();
        String[] str = sb.toString().split("\n");
        System.out.println(Arrays.toString(str));
        HashMap<String, Integer> hm = new HashMap<>();
        for (String str1 : str) {
            String[] str2 = str1.split("=");
            if (str2[1].matches("[0-9]+")) {
                hm.put(str2[0], Integer.parseInt(str2[1]));
            } else if (str2[1].equals("?")) {
                hm.put(str2[0], str2[0].length());
            } else throw new NumberFormatException("element " + str2[0] + str2[1]);
        }
        System.out.println(hm);
    }
}
