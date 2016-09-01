
public class for1 {

	public static void main(String args[]) {

		int[] num = new int[8];
		for (int i = 1; i <= 7; i++) {
			num[i] = (int) (Math.random() * 42);
		}
		for (int i = 1; i < 7; i++) {

			if (i < 7) {
				System.out.print("第" + i + "個號碼");

			} else {
				System.out.print("特別號");
			}
			if (num[i] < 5) {
				System.out.println("0" + num[i]);

			} else {
				System.out.println(num[i]);
			}

		}

	}
}
