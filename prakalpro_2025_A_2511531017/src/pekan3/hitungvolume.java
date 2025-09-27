package pekan3;
import java.util.Scanner;
public class hitungvolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        double r, t, volume;
		        final double PI = 3.14;
		        Scanner keyboard = new Scanner(System.in);
		        System.out.print("Masukkan jari-jari tabung: ");
		        r = keyboard.nextDouble();
		        System.out.print("Masukkan tinggi tabung: ");
		        t = keyboard.nextDouble();
		        keyboard.close();
		        volume = PI * r * r * t;
		        System.out.println("Volume tabung = " + volume);
		    }
	}

