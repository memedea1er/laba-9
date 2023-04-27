import java.util.*;

import static java.lang.Math.*;

public class zadanie_4 {
    public static int strok(Character[][] array, ArrayList<Integer> list) {
        int x = 0;
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (48 <= array[i][j] & array[i][j] <= 57 & 48 <= array[i + 1][j] & array[i + 1][j] <= 57
                        & 48 <= array[i + 2][j] & array[i + 2][j] <= 57 & 48 <= array[i + 3][j] & array[i + 3][j] <= 57) {
                    if ((int) (array[i][j] - 48) * ((int) (array[i + 1][j] - 48) - (int) (array[i + 2][j] - 48)) == (int) (array[i + 3][j] - 48)) {
                        System.out.println((int) (array[i][j] - 48) + "*(" + (int) (array[i + 1][j] - 48) + "-" + (int) (array[i + 2][j] - 48)  + ")=" +
                                (int) (array[i + 3][j] - 48) + " (Правильно, столбик)");
                        x += 1;
                    } else {
                        System.out.println((int) (array[i][j] - 48) + "*(" + (int) (array[i + 1][j] - 48) + "-" + (int) (array[i + 2][j] - 48)  + ")=" +
                                (int) (array[i + 3][j] - 48) + " (Неравильно, столбик)");
                        list.add((int) (array[i][j] - 48));
                        list.add((int) (array[i + 1][j] - 48));
                        list.add((int) (array[i + 2][j] - 48));
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 3; j++) {
                if (48 <= array[i][j] & array[i][j] <= 57 & 48 <= array[i][j + 1] & array[i][j + 1] <= 57
                        & 48 <= array[i][j + 2] & array[i][j + 2] <= 57 & 48 <= array[i][j + 3] & array[i][j + 3] <= 57) {
                    if ((int) (array[i][j] - 48) * ((int) (array[i][j + 1] - 48) - (int) (array[i][j + 2] - 48)) == (int) (array[i][j + 3] - 48)) {
                        System.out.println((int) (array[i][j] - 48) + "*(" + (int) (array[i][j+1] - 48) + "-" + (int) (array[i][j+2] - 48)  + ")=" +
                                (int) (array[i][j+3] - 48) + " (Правильно, строка)");
                        x += 1;
                    } else {
                        System.out.println((int) (array[i][j] - 48) + "*(" + (int) (array[i][j+1] - 48) + "-" + (int) (array[i][j+2] - 48)  + ")=" +
                                (int) (array[i][j+3] - 48) + " (Неправильно, строка)");
                        list.add((int) (array[i][j] - 48));
                        list.add((int) (array[i][j + 1] - 48));
                        list.add((int) (array[i][j + 2] - 48));
                    }
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int n = 5 + (int) (random() * 10);
        Character[][] array = new Character[n][n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (char) (48 + (int) (random() * (64 - 48)));
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("Количество правильных: " + strok(array, list) + "\nНеправильные:\n");
        for (int i = 0; i < list.size() - 2; i += 3) {
            System.out.println(list.get(i) + "*(" + list.get(i + 1) + "-" + list.get(i + 2) + ")=" +
                    (list.get(i) * (list.get(i + 1) - list.get(i + 2))));
        }
    }
}