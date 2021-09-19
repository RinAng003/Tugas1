import java.util.Scanner;

public class JawabanE {
    public static void main(String[] args){
        float a, t, luas;

        Scanner angka = new Scanner(System.in);
        a = angka.nextFloat();
        t = angka.nextFloat();

        luas = a*t/2;

        System.out.printf("%.2f", luas);
    }
    
}
