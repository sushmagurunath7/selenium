package findelements_programs;

public class p9 {
	public static void main(String[] args) {
		String price = "Rs. 3595Rs. 3995(10% OFF)";
		String[] x = price.split("Rs.");
		String z = x[1].trim();
		Integer IntPrice = Integer.valueOf(z);
		System.out.println(z);
	}
}
