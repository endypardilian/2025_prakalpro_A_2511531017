package pekan7_2511531017;
import java.util.Scanner;

public class Registrasi_2511531017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- REGISTRASI AKUN BARU ---");        
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();        
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();        
        System.out.print("Masukkan Email: ");
        String email = input.nextLine();        
        System.out.print("Masukkan PIN (6 digit): ");
        int pin = input.nextInt();        
        Akun_2511531017 a = new Akun_2511531017(username, password, email, pin);        
        if (!a.isPasswordValid() || !a.isEmailValid()) {
            System.out.println("--- REGISTRASI GAGAL ---");
            
            if (!a.isPasswordValid()) {
                System.out.println("Password harus 8 karakter atau lebih.");
            }
            
            if (!a.isEmailValid()) {
                System.out.println("Email Anda \"" + a.getEmail() + "\" tidak valid (harus mengandung '@' dan '.').");
            }
            
            System.out.println("Silakan coba lagi.");
        } else {
        	System.out.println();
            System.out.println("--- REGISTRASI BERHASIL ---");
            System.out.println("Akun untuk \"" + a.getUsername() + "\" telah berhasil dibuat.");
            System.out.println();
            System.out.println("--- Detail Akun ---");
            System.out.println("Username (Lowercase): " + a.getUsername().toLowerCase());
            System.out.println("Email (Uppercase) : " + a.getEmail().toUpperCase());
            System.out.println("ID Pengguna (Gabungan): " + a.getIdPengguna());
            System.out.println();
            System.out.println("--- Uji Tipe Data (PIN Anda: " + a.getPin() + ") ---");
            System.out.println("PIN (int) + 10 = " + (a.getPin() + 10));
            System.out.println("PIN (String) + \"10\" = " + String.valueOf(a.getPin()) + "10");
        }
        
        input.close();
    }
}