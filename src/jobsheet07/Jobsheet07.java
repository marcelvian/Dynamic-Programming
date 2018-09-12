package jobsheet07;

import java.math.BigInteger;
import java.util.Scanner;

public class Jobsheet07 {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args) {
        String identitas = "Marcel Sinko Octavian / XRPL3 / 21";
        
        tampilJudul(identitas);
        int n = tampilInput();
        BigInteger hasil = fibo(n);
    }
    private static int tampilInput() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }
    private static BigInteger fibo(int n) {
        
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 2; i < n; i++) {
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    
}
