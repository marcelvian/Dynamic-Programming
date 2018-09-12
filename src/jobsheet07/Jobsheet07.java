package jobsheet07;
public class Jobsheet07 {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    public static void main(String[] args) {
        String identitas = "Marcel Sinko Octavian / XRPL3 / 21";
        
        tampilJudul(identitas);
    }
    
}
