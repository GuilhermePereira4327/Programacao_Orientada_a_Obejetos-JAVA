package util;

public class CurrencyConverter {

	public static double price;
	public static double quantity;
	
	public static final double IOF = 1.06;
	
	public static double dolarInReal() {
		return (quantity * price) * IOF;
	}
}
