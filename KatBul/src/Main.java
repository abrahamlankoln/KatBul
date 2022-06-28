import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen bir sayi giriniz: ");
		num = deger.nextInt();

		for (int i = 1; i <= num; i *= 4) {
			System.out.println(i);
		}
		for (int j = 1; j <= num; j *= 5) {
			System.out.println(j);
		}
	}

}
