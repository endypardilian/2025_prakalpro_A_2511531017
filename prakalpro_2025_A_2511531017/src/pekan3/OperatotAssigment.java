package pekan3;

import java.util.Scanner;

public class OperatotAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1:");
		A1 = keyboard.nextInt(); //input 10
		System.out.println("Input angka-2:");
		A2 = keyboard.nextInt();
		keyboard.close();// input 5
		System.out.println("Assigmnet penambahan");
		A1 += A2; //penambahan, sekarang A1=15
		System.out.println("Penambahan : " + A1);
		System.out.println("Assigmnet pengurangan");
		A1 -= A2; //pengurangan, sekarang A1=10
		System.out.println("Pengurangan : " + A1);
		System.out.println("Assigment perkalian");
		A1 *= A2; //perkalian, sekarang A1=50
		System.out.println("Perkalian : " + A1);
		System.out.println("Assigment hasil bagi");
		A1 /= A2; //hasil bagi, sekarang A1=2
		System.out.println("Pembagian : " + A1 );
		System.out.println("Assigmnet sisa bagi");
		A1 %= A2; //sisa bagi, sekarang A1=0
		System.out.println("Sisa Bagi : " + A1);
		
		
		
		

	}

}
