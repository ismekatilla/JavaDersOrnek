import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
//		System.out.print("Kaça kadar kontrol edilecek=");
//		Scanner scanner = new Scanner(System.in);
//		int kontrolEdilecekSonSayi = scanner.nextInt();
//		for (int i = 0; i < kontrolEdilecekSonSayi; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		
		String text = "ABCDEF";
		int donguSayisi = text.length();
		for (int i = 0; i < donguSayisi; i++) {
			String substring = text.substring(0, i + 1);
			System.out.println(substring);
		}
		
	}
}