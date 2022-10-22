package Seminar;

public class Ex_2 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"2.4", "5", "g"},{"2", "9", "43", "3"},{"8", "0", "7"}};
        int result = sum2d(arr);
        System.out.println(result);
    }



    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("[0-9]+")) {
                    val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } else {
                    System.out.println("NumberFormatException: element = " + arr[i][j]);
                }
//                try {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                } catch (NumberFormatException e) {
//                    System.out.println("NumberFormatException: element = " + arr[i][j]);
//                }
            }
        }
        return sum;
    }
}
