import java.util.Scanner;

public class zadanie_3 {
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
    public static int abc(Character[] array, char s){
        int a=0;
        for (int i=0; i<10; i++) {
            if (array[i] == s) {
                a+=1;
            }
        }
        return a;
    }
    public static boolean c(Character[] array, String s){
        boolean cp=true;
        for (int i = 0; i < s.length(); i++) {
            if (abc(array,s.charAt(i))==0) {
                cp=false;
                break;
            }
        }
        return cp;
    }
    public static boolean d(Character[] array, String s){
        boolean a=false;
        for (int i=0; i<9; i++) {
            if ((String.valueOf(array[i])+String.valueOf(array[i+1])).equals(s)) {
                a=true;
                break;
            }
        }
        return a;
    }
    public static boolean e(Character[] array){
        boolean a=false;
        char kostil=array[0];
        for (int i=1; i<9; i++) {
            if (array[i] == kostil) {
                a=true;
                break;
            }
            kostil=array[i];
        }
        return a;
    }
    public static boolean f(Character[] array, int i, int l){
        boolean a=false;
        if (array[i] == array[(i+l)%10]) {
            a=true;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Character[] array = new Character[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите элемент массива " + (i+1));
            array[i] = vvod();
        }
        System.out.println("б) Введите символ");
        char b=vvod();
        System.out.println("в) Введите строку");
        String c = in.next();
        int i=-1;
        int j=-1;
        int l=-1;
        while (true) {
            System.out.println("e) Введите i (1<i<j<11)");
            i = in.nextInt()-1;
            System.out.println("e) Введите j (1<i<j<11)");
            j = in.nextInt()-1;
            System.out.println("e) Введите l (1<i<j<11)");
            l = in.nextInt();
            if (i+1>l & j+1>i+1 & 11>j+1) {
                break;
            }
        }
        System.out.println("а) " + abc(array, ' '));
        System.out.println("б) " + abc(array, b));
        System.out.println("в) " + c(array,c));
        System.out.println("г) " + (d(array,"но") | d(array,"он")));
        System.out.println("д) " + e(array));
        System.out.println("e) " + (f(array,i,l) & f(array,j,l)));
    }
}