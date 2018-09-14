package Jobsheet07;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args)
    {
        String identitas = "Marcel Sinko Octavian / X RPL 3 / 21";
        System.out.println(identitas);
        System.out.println();
        int[] berat = {7, 5, 4, 3, 2};
        int[] bayaran = {10000, 7000, 5000, 3000, 2000};
        Scanner baca = new Scanner(System.in);
        System.out.print("Jumlah Berat : " + "kg"  );
        int total = baca.nextInt();
        
        
        for(int i = 0; i < berat.length; i++)
        {
            int jumlah = total / berat[i];
            total = total - (berat[i] * jumlah);
            
            System.out.println("Jumlah " + berat[i] + " : " + jumlah);
        }
    }
}
