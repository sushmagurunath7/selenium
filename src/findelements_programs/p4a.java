package findelements_programs;

public class p4a {
	public static void main(String[] args) {
		String price= "₹1,04,900";
		String p1= price.substring(1);
		String p2 = p1.replaceAll(",", "");
		int intPrice = Integer.parseInt(p2);
		
		System.out.println(price);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(intPrice);
		
		
	}

}
