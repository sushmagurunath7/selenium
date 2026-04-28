package findelements_programs;

public class AjioGshock implements Comparable<AjioGshock>{
	String name;
	String price;
	
	public AjioGshock(String name, String price){
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return this.name+"="+this.price;
	}
	
	public int compareTo(AjioGshock obj) {
		/* String p1=this.price.substring(1).replaceAll(",","");
		String p2= obj.price.substring(1).replaceAll(",", "");
		Integer x1 = Integer.valueOf(p1);
		Integer x2= Integer.valueOf(p2);
		return x1.compareTo(x2); //--Ascending order
		return -x1.compareTo(x2); --descending order*/
		
		//logic to sort based on name--alphabetical order
		return this.name.compareTo(obj.name); 
	}
	
}
