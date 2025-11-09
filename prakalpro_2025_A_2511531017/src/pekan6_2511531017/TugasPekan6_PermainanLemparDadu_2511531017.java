package pekan6_2511531017;
import java.util.Scanner;
import java.util.Random;
public class TugasPekan6_PermainanLemparDadu_2511531017 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int stop = 7;
        int percobaan = 0;
        boolean menang = false;
        boolean lanjut = true;
        while (lanjut) {
            percobaan++;
            int dadu1 = rand.nextInt(6) + 1;
            int dadu2 = rand.nextInt(6) + 1;
            int hasil = dadu1 + dadu2;
            System.out.println(dadu1 + " + " + dadu2 + " = " + hasil);
            if (hasil == stop) {
                System.out.println("Tebakan Anda Benar");
                System.out.println("Anda menang setelah " + percobaan + " percobaan!");
                menang = true;
                break;
            } else {
                System.out.println("Tebakan Anda Salah");
                System.out.print("Apakah mau lempar dadu (ya / tidak?) ");
                String jawab = input.nextLine();

                if (jawab.equalsIgnoreCase("tidak")) {
                    lanjut = false;
                }
            }
        }

        if (!menang) {
            System.out.println("Anda gagal menang");
        }

        input.close();
    }
}