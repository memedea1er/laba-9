import java.util.*;

public class zadanie_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String st = in.nextLine();
        boolean pr=true;
        int x=0;
        for (int i=0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if (!(((int)ch>1071 & (int)ch<1106) | ((int)ch>1071 & (int)ch<1106) | ch==' ')) {
                pr=false;
            }
            if (st.charAt(i)==' ' | i==st.length()-1) {
                if (pr) {
                    x++;
                }
                pr=true;
            }
        }
        System.out.println(x);
    }
}