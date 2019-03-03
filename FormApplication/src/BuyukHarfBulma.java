
public class BuyukHarfBulma {

	public static void main(String[] args) {
		String bH = "NeSlİhAn";
		for (int i = 0; i < bH.length(); i++) {
			char cc = bH.charAt(i);
			if ((int) cc < 90) {
				System.out.println(cc);
			}
		}
	}
}