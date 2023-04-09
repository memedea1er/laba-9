import java.util.Scanner;
import static java.lang.Math.*;

public class zadanie_2 {
    public static char vvod(){
        Scanner in = new Scanner(System.in);
        String x = in.next();
        char t = ' ';
        while (true) {
            if (x.length()!=1) {
                System.out.println("Элемент массива должен быть одним символом");
                x = in.next();
            }
            else {
                t=x.charAt(0);
                break;
            }
        }
        return t;
    }
    public static boolean prov(Character[] array){
        for (int i=0; i<10; i++) {
            if (array[i] != '1' & array[i] != '0') {
                System.out.println("Массив содержит неверные символы, веедите снова");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Character[] array = new Character[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите элемент массива " + i);
            array[i] = vvod();
        }
        int a=0;
        while (true) {
            if (prov(array)) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(array[i] + " ");
                    if (array[i] == '1') {
                        a += pow(2, 9-i);
                    }
                }
                System.out.print("\n" + a);
                break;
            }
            else {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Введите элемент массива " + i);
                    array[i] = vvod();
                }
            }
        }
    }
}