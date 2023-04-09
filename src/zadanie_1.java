import java.util.*;

public class zadanie_1 {
    public static char numb(char x){
        for (int i=0; i<10; i++) {
            if (x == Character.forDigit(i,10)) {
                return '*';
            }
        }
        return x;
    }
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
    public static void main(String[] args) {
        Character[] array = new Character[10];
        for (int i=0; i<10; i++) {
            System.out.println("Введите элемент массива " + i);
            array[i]=vvod();
        }
        for (int i=0; i<10; i++) {
            array[i]=numb(array[i]);
            System.out.print(array[i] + " ");
        }
    }
}