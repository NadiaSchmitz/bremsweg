public class Main {

	public static void main(String[] args) {
		
		int i;
		int x_werte[] = {0, 30, 50, 80, 100, 120, 150};
		int y_werte[] = new int[7];
		
		System.out.println("   X" + "     " + "Y");
		System.out.println("--------------------");
		
		for (i = 0; i < x_werte.length; i++) {
			
			y_werte[i] = (int) (Math.pow(x_werte[i], 2) / 100);
			
			System.out.println("   " + x_werte[i] + "     " + y_werte[i]);
			
		}

	}

}
