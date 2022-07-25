package fisjava;

public class TestShopping {
	public static void main(String args[]) {
		
		Shopping shop1 = new Shopping();
		Shopping shop2 = new Shopping();
		
		shop1.selectGoods();
		shop1.payment();
		shop1.shipment();
		
		shop2.selectGoods();
		shop2.payment();
		shop2.shipment();
		
	}

}
