import java.util.*;

public class zadanie_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String st = in.nextLine();
        boolean pr=true;
        for (int i=0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if (ch==' ' | i==st.length()-1) {
                if (pr) {
                    int j = i-1;
                    while (j!=0) {
                        j--;
                        if (st.charAt(j)==' ') {
                            j++;
                            break;
                        }
                    }
                    if ((int)st.charAt(j)>96 & (int)st.charAt(j)<123) {
                        st = st.substring(0,j)+(char)(int)(st.charAt(j)-32)+st.substring(j+1);
                    }
                }
                pr=true;
            }
            if (!(((int)ch>64 & (int)ch<91) | ((int)ch>96 & (int)ch<123) | ch==' ')) {
                pr=false;
            }
        }
        System.out.println(st);
    }
}