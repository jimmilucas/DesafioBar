package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if (feeding()> 30 ) {
			return 0;
		} else {
			return 4;
		}
	}
	
	public double feeding() {
		return beer * 5 + softDrink * 3 + barbecue * 7;
	}
	
	public double ticket() {
		if (gender == 'F' || gender == 'f') {
			return 8;
		} else if (gender == 'M' || gender == 'm'){
			return 10;
		} else
			return 0;
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
}
