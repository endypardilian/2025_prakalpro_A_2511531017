package pekan5;

public class tugasNestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int line=1;line<=5;line++) {
			for (int j=5; j >line;j--) {
				System.out.print(".");
			}
			System.out.print(line);
			for (int i=1;i<line;i++) {
				System.out.print(".");
			
			}
			System.out.println();
		}

	}

}
