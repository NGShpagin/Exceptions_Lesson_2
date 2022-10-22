package Seminar;

import java.io.*;

public class Ex_4 {
    public static void main(String[] args) {
        Ex_4 re = new Ex_4();
        re.ex1();
    }

    public void ex1(){
//        InputStream inputStream;
        try{
            String[] strings = {"sadad", "dasdadsa"};
            String strings1 = strings[1];
            test(strings1);
//            int a = 1/0;
//            inputStream = new FileInputStream("dsadsdads");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public void test(String str) throws IOException {
        File file = new File("1");
        if (file.createNewFile()) {
            FileWriter fw = new FileWriter(file);
            fw.append(str);
            fw.flush();
            fw.close();
        }
//        FileReader reader = new FileReader(file);
//        reader.read();
//        reader.close();
//        test();
    }
}
