// import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // printThreeWords();
        // checkSumSign();
        // printColor();
        // compareNumbers();
        // checkSum(9, 2);
        // checkIntSout(-1);
        // checkIntReturn(0);
        // repeatVictoryShouting("УА!", 3);
        // isLeapYear(2028);
        // replaceNum();
        // fillUpMyArr();
        // multiplyHeretics();
        // fillUpMySquare(4);
        // createArr(5, 2);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -1;
        int b = 0;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2;
        int b = 1;
        if (a >= b) {
            System.out.println(a + ">=" + b);
        } else {
            System.out.println(a + "<" + b);
        }
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            // System.out.println("true");
            return true;
        } else {
            // System.out.println("false");
            return false;
        }
    }

    public static void checkIntSout(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkIntReturn(int a) {
        if (a >= 0) {
            // System.out.println("false");
            return false;
        } else {
            // System.out.println("true");
            return true;
        }
    }

    public static void repeatVictoryShouting(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean isLeapYear(int a) {
        if (a % 400 == 0) {
            // System.out.println("Високосный");
            return true;
        } else if (a % 100 == 0) {
            // System.out.println("Обычный");
            return false;
        } else if (a % 4 == 0) {
            // System.out.println("Високосный");
            return true;
        } else {
            // System.out.println("Обычный");
            return false;
        }
    }

    public static void replaceNum() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 0};
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        // System.out.println(Arrays.toString(arr));
    }

    public static void fillUpMyArr() {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        // System.out.println(Arrays.toString(arr));
    }

    public static void multiplyHeretics() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        // System.out.println(Arrays.toString(arr));
    }

    public static void fillUpMySquare(int a) {
        int [][] square = new int [a][a];
        for (int i = 0; i < a; i++) {
            square[i][i] = 1;
            square[i][a - 1 - i] = 1;
        }
        // System.out.println(Arrays.deepToString(square));
    }

    public static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
}
