package jobsheet07;
import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        int[] nominal = new int[] {5000, 2000, 1000, 500, 100};
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah uang : ");
        int uang = scan.nextInt();
        int i;
        
        for(i = 0; i < 5; i++) {
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("Lembar "+ nominal[i] +" = "+ jumlah);
        }
    }
}
